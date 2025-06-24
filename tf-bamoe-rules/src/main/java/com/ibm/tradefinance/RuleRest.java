package com.ibm.tradefinance;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessInstance;

import com.ibm.tradefinance.model.RuleRequest;
import com.ibm.tradefinance.model.RuleResponse;

@Path("/rules")
public class RuleRest {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RuleResponse evaluate(RuleRequest request) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kSession = kieContainer.newKieSession("defaultKieSession");

        RuleResponse response = new RuleResponse();

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("request", request);
        parameters.put("response", response);
        kSession.insert(request);
        kSession.insert(response);

        try {
            // ✅ Correct process ID from your BPMN: id="trade_decision_flow"
            ProcessInstance processInstance = kSession.startProcess("trade_decision_flow", parameters);
            System.out.println("Process started: ID = " + processInstance.getId());
        } catch (Exception e) {
            e.printStackTrace();
            throw new WebApplicationException("Failed to start process: " + e.getMessage(), 500);
        } finally {
            kSession.dispose();
        }

        return response;
    }
}
