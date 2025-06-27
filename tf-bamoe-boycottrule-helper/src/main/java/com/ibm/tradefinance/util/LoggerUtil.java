package com.ibm.tradefinance.util;

import java.util.List;
import java.util.logging.Logger;

public class LoggerUtil {
	private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());

	public static void logRuleExecution(String ruleName) {
		logger.info("Rule Fired = " + ruleName);
	}

	public static void logRuleExecution(String name, String value) {
		logger.info("Name = " + name + " Value = " + value);
	}
	
	public static void logRuleExecution(String ruleName, String name, String value) {
		logger.info("Rule Fired = " + ruleName + " Name = " + name + " Value = " + value);
	}

	public static void logRuleExecution(String name, String status, String message, String refData,
			List<String> highLightedTexts) {

		logger.info("Rule Fired = " + name + " Status = " + status + " Message = " + message + " Reference Data = "
				+ refData + " Highlighted Text = " + highLightedTexts);

	}

	public static void logRuleExecution(String name, String status, String message, String refData,
			List<String> highLightedTexts, boolean advisoryStatus) {

		logger.info("Rule Fired = " + name + " Status = " + status + " Message = " + message + " Reference Data = "
				+ refData + " Highlighted Text = " + highLightedTexts + " Advisory Status = " + advisoryStatus);

	}

	public static void logRuleExecution(String name, String status, String message, String refData) {

		logger.info("Rule Fired = " + name + " Status = " + status + " Message = " + message + " Reference Data = "
				+ refData);

	}

	public static void logRuleExecution(String name, String status, String message, String refData,
			boolean advisoryStatus) {
		logger.info("Rule Fired = " + name + " Status = " + status + " Message = " + message + " Reference Data = "
				+ refData + " Advisory Status = " + advisoryStatus);

	}
}
