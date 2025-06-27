package com.ibm.tradefinance.service;

import com.ibm.tradefinance.model.*;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.kie.api.runtime.KieSession;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

@ApplicationScoped
public class RuleEngineService {

    @Inject
    GenAIService genAIService;

    private final KieContainer kieContainer;

    public RuleEngineService() {
        this.kieContainer = KieServices.Factory.get().getKieClasspathContainer();
    }

    public RuleResponse executeRules(RuleRequest request) {
        RuleResponse response = new RuleResponse();

        KieSession session = kieContainer.newKieSession("defaultKieSession");

        if (session == null) {
            throw new IllegalStateException("KieSession 'ksession-rules' is null. Check kmodule.xml and session name.");
        }
        if (genAIService == null) {
            System.err.println("[FATAL] genAIService is null before setting global!");
        }
        session.setGlobal("genAIService", genAIService);
        session.setGlobal("response", response);

        session.insert(request);
        session.fireAllRules();
        session.dispose();

        return response;
    }
}