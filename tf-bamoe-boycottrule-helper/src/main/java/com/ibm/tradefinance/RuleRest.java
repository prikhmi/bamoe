package com.ibm.tradefinance;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.tradefinance.model.*;
import com.ibm.tradefinance.service.*;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rules")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RuleRest {

    @Inject
    GenAIService genAIService;

    @Inject
    RuleEngineService ruleEngineService;

    @Inject
    ObjectMapper mapper;

    @POST
    @Path("/boycott")
    public RuleResponse checkBoycottClause(RuleRequest request) {
        RuleResponse errorResponse = new RuleResponse();
        try {
            String genAiJson = genAIService.getGenAIResponse(request);

            if (genAiJson == null || genAiJson.isBlank()) {
                errorResponse.addRuleResult(
                        new RuleResult("GenAPI Error", "FAILED",
                                "No response from GenAPI. Possibly unauthorized (401).", null));
                return errorResponse;
            }

            GenAPIResponse genAPIResponse = mapper.readValue(genAiJson, GenAPIResponse.class);
            return ruleEngineService.executeRules(genAPIResponse);

        } catch (Exception e) {
            errorResponse.addRuleResult(
                    new RuleResult("Parsing Error", "FAILED", e.getMessage(), null));
            return errorResponse;
        }
    }
}