package com.ibm.tradefinance.util;

public class AppConstants {

	public static String BOYCOTT_YES = "Possible Boycott Language present in the LC.";
	public static String BOYCOTT_NO = "Boycott Language is not present in the LC.";
	
	public static String SANCTION_YES = "There is presence of sanction clause in the Letter of Credit.";
	public static String SANCTION_NO = "Sanction clause is not present in the Letter of Credit.";

	public static String EXPIRY_SHIPMENT_DATE_CHECK_PASS = "The difference between the Expiry Date and the Shipment Date is sufficient and meets the required presentation period.";
	public static String EXPIRY_SHIPMENT_DATE_CHECK_FAIL = "The difference between the Expiry Date and the Shipment Date is less than the required presentation period / Expiry date is the same as or prior to the shipment date.";

	public static String EXPIRY_PLACE_CHECK_PASS = "Place of expiry is consistent with LC Terms.";
	public static String EXPIRY_PLACE_CHECK_FAIL = "Place of expiry is not consistent with LC Terms.";

	public static String PORT_CHECK_PASS = "Port mentioned in the LC is a Valid Port.";
	public static String PORT_CHECK_FAIL = "Port mentioned in the LC is not a Valid Port.";

	public static String SEQ_CHECK_PASS = "Complete LC received.";
	public static String SEQ_CHECK_FAIL = "Incomplete LC received, Please check if we have also received the other part of the LC.";

	public static String EXPIRY_SHIPMENT_DATE_EQL_CHECK_PASS = "Expiry date is later than the shipment date.";
	public static String EXPIRY_SHIPMENT_DATE_EQL_CHECK_FAIL = "Expiry date is the same as or prior to the shipment date.";

	public static String INCO_SEA_PASS = "Incoterms mentioned in the LC is in line with Sea Shipment.";
	public static String INCO_SEA_FAIL = "Incoterms mentioned in the LC is not in line with Sea Shipment.";

	public static String INCO_INSURANCE_PASS = "LC does call for Insurance documents, and the Incoterms states CIP/CIF.";
	public static String INCO_INSURANCE_FAIL = "LC does not call for Insurance documents, whereas the Incoterms states CIP/CIF.";

	public static String CTR_GOODS_PASS_BOL = "Transport document does not contain Bill of Lading.";
	public static String CTR_GOODS_PASS = "Control of Goods is not with aplicant or Third party.";
	public static String CTR_GOODS_FAIL = "Control of Goods is with aplicant or Third party.";
	public static String CTR_GOODS_FAIL_ANALYZE = "To be analyzed.";
	public static String CTR_GOODS_UNCONFIRM = "LC is Unconfirmed.";

	public static String GOODS_DESC_PASS = "LC amount matches with the Total goods description amount.";
	public static String GOODS_DESC_FAIL = "LC amount does not match with the Total goods description amount.";
	public static String GOODS_DESC_CURRENCY_FAIL = "The currency specified in LC is not aligned with the currency mentioned in the Goods Description.";
	
	public static String TRANSPORT_DOC_PASS = "Transport document available in the LC.";
	public static String TRANSPORT_DOC_FAIL = "Transport document not available in the LC.";

	public static String HIGH_RISK_PASS = "Proceed with Transaction.";
	public static String HIGH_RISK_FAIL = "Throwback the Transaction to MO.";
	public static String HIGH_RISK_ANALYZE = "To be Analyzed.";

	public static String HERMES_PASS = "to Proceed.";
	public static String HERMES_FAIL = "THROWBACK TO MO.";

	public static String PASS = "PASS";
	public static String FAIL = "FAIL";
	
	public static String ADV_FEE_CODE="EXPC ADVIS";
	public static String SWT_FEE_CODE="291-SWIFT OPN EUROP";
	

}
