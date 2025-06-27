package com.ibm.tradefinance.model;

public class GenAPIResponse {
    private Request request;
    private String __DecisionID__;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String get__DecisionID__() {
        return __DecisionID__;
    }

    public void set__DecisionID__(String __DecisionID__) {
        this.__DecisionID__ = __DecisionID__;
    }

    public static class Request {
        private LetterOfCredit loc;
        private GenAiData gen_ai_response;

        public LetterOfCredit getLoc() {
            return loc;
        }

        public void setLoc(LetterOfCredit loc) {
            this.loc = loc;
        }

        public GenAiData getGen_ai_response() {
            return gen_ai_response;
        }

        public void setGen_ai_response(GenAiData gen_ai_response) {
            this.gen_ai_response = gen_ai_response;
        }

        @Override
        public String toString() {
            return "Request [loc=" + loc + ", gen_ai_response=" + gen_ai_response + "]";
        }
    }

    @Override
    public String toString() {
        return "GenAPIResponse [request=" + request + ", __DecisionID__=" + __DecisionID__ + "]";
    }
}
