package com.ibm.tradefinance.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.ibm.tradefinance.util.LoggerUtil;

public class RuleResponse {
	private static final Logger logger = Logger.getLogger(RuleResponse.class.getName());
	private List<RuleResult> ruleResults = new ArrayList<RuleResult>();
	private List<Charge> charges = new ArrayList<Charge>();
	private String chargeAccount;

	public List<RuleResult> getRuleResults() {
		// System.out.println("Rule set size is " + ruleResults.size());
		return ruleResults;
	}

	public void setRuleResults(List<RuleResult> ruleResults) {
		this.ruleResults = ruleResults;
	}

	public List<Charge> getCharges() {
		return charges;
	}

	public void setCharges(List<Charge> charges) {
		this.charges = charges;
	}

	public String getChargeAccount() {
		return chargeAccount;
	}

	public void setChargeAccount(String chargeAccount) {
		this.chargeAccount = chargeAccount;
	}

	public void addCharges(String code, double amount, String currency) {

		Charge charge = new Charge(code, amount, currency);
		logger.info("addCharges = [" + code + " - " + amount + " - " + currency + "]");
		charges.add(charge);
	}

	public void addCharges(String code, double amount, String currency, double minamount) {
		double amt = amount;
		if (amount < minamount && minamount != 0) {
			amt = minamount;
		}
		Charge charge = new Charge(code, amt, currency);
		logger.info("addCharges = [" + code + " - " + amount + " - " + currency + " - " + minamount + "]");
		charges.add(charge);
	}

//with highlight and without advisory
	public void addRuleResult(String name, String status, String message, String refData, String highLightedTexts) {
		// System.out.println("Highlighted Text : : " + highLightedTexts);
		List<String> highLightedTextList = Arrays.stream(highLightedTexts.split(":")).collect(Collectors.toList());
		RuleResult ruleResult = new RuleResult(name, status, message, refData, highLightedTextList);
		// logger.info("[ Rule Name = " + name + " Status = " + status + " Message = " +
		// message + " Reference Data = " + refData + " Highlighted Text = " +
		// highLightedTexts + "]");
		LoggerUtil.logRuleExecution(name, status, message, refData, highLightedTextList);
		ruleResults.add(ruleResult);
	}

//without highlight and without advisory
	public void addRuleResult(String name, String status, String message, String refData) {

		RuleResult ruleResult = new RuleResult(name, status, message, refData);
		LoggerUtil.logRuleExecution(name, status, message, refData);
		ruleResults.add(ruleResult);
	}

	// with highlight and with advisory
	public void addRuleResult(String name, String status, String message, String refData, String highLightedTexts,
			boolean advisoryStatus) {
		// System.out.println("Highlighted Text : : " + highLightedTexts);
		List<String> highLightedTextList = Arrays.stream(highLightedTexts.split(":")).collect(Collectors.toList());
		RuleResult ruleResult = new RuleResult(name, status, message, refData, highLightedTextList, advisoryStatus);
		// logger.info("[ Rule Name = " + name + " Status = " + status + " Message = " +
		// message + " Reference Data = " + refData + " Highlighted Text = " +
		// highLightedTexts + "]");
		LoggerUtil.logRuleExecution(name, status, message, refData, highLightedTextList, advisoryStatus);
		ruleResults.add(ruleResult);
	}

	// without highlight and with advisory
	public void addRuleResult(String name, String status, String message, String refData, boolean advisoryStatus) {

		RuleResult ruleResult = new RuleResult(name, status, message, refData, advisoryStatus);
		LoggerUtil.logRuleExecution(name, status, message, refData, advisoryStatus);
		ruleResults.add(ruleResult);
	}

	public void addRuleResult(String message) {

		RuleResult ruleResult = new RuleResult(message);
		System.out.println(message);
		ruleResults.add(ruleResult);
	}

	@Override
	public String toString() {
		return "RuleResponse [ruleResults=" + ruleResults + ", charges=" + charges + "]";
	}

}