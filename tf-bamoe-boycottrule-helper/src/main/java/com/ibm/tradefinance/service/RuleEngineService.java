package com.ibm.tradefinance.service;

import com.ibm.tradefinance.model.*;
import javax.enterprise.context.ApplicationScoped;
import org.kie.api.runtime.KieSession;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

@ApplicationScoped
public class RuleEngineService {

    private final KieContainer kieContainer;

    public RuleEngineService() {
        this.kieContainer = KieServices.Factory.get().getKieClasspathContainer();
    }

    public RuleResponse executeRules(GenAPIResponse request) {
        RuleResponse response = new RuleResponse();
        KieSession session = kieContainer.newKieSession("defaultKieSession");

        session.setGlobal("response", response);
        session.insert(request);
        session.fireAllRules();
        session.dispose();

        return response;
    }
}