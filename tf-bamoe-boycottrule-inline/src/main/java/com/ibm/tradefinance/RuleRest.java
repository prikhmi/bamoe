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
    RuleEngineService ruleEngineService;

    @Inject
    ObjectMapper mapper;

    @POST
    @Path("/boycott")
  public RuleResponse checkBoycottClause(RuleRequest request) {
    try {
        return ruleEngineService.executeRules(request); // 
    } catch (Exception e) {
        RuleResponse errorResponse = new RuleResponse();
        errorResponse.addRuleResult(
            new RuleResult("Execution Error", "FAILED", e.getMessage(), null)
        );
        return errorResponse;
    }
}
}