package com.ibm.tradefinance.model;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RuleRequest {

	private String processType;
	private String requestId;
	private List<Document> documents = new ArrayList<Document>();
	
	@JsonProperty("process_type")
	public String getProcessType() {
		return processType;
	}

	@JsonProperty("process_type")
	public void setProcessType(String processType) {
		this.processType = processType;
	}

	@JsonProperty("request_id")
	public String getRequestId() {
		return requestId;
	}

	@JsonProperty("request_id")
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@JsonProperty("documents")
	public List<Document> getDocuments() {
		return documents;
	}

	@JsonProperty("documents")
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "RuleRequest [processType=" + processType + ", requestId=" + requestId + ", documents=" + documents
				+ "]";
	}
	
	

}