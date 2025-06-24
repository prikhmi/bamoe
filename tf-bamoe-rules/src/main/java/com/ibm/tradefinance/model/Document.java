package com.ibm.tradefinance.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {
	@JsonProperty("document_id")
	private String documentId;

	@JsonProperty("document_type")
	private String documentType;

	@JsonProperty("LCSender")
	private String lcSender;

	@JsonProperty("LCReceiver")
	private String lcReceiver;

	@JsonProperty("LCMsgType")
	private String lcMsgType;

	@JsonProperty("LCMsgAdvice")
	private String lcMsgAdvice;

	@JsonProperty("LCDate")
	private String lcDate;

	@JsonProperty("LCRefNo")
	private String lcRefNo;

	@JsonProperty("LCSequenceOfTotal")
	private List<String> lcSequenceOfTotal;

	@JsonProperty("LCFormOfDocumentaryCredit")
	private String lcFormOfDocumentaryCredit;

	@JsonProperty("LCTransRefNo")
	private String lcTransRefNo;

	@JsonProperty("LCDateOfIsuue")
	private String lcDateOfIssue;

	@JsonProperty("LCApplicableRules")
	private String lcApplicableRules;

	@JsonProperty("LCDateExpiry")
	private String lcDateExpiry;

	@JsonProperty("LCPlaceExpiry")
	private String lcPlaceExpiry;

	@JsonProperty("LCIssuingBank")
	private String lcIssuingBank;

	@JsonProperty("LCApplicantNameAndAddress")
	private String lcApplicantNameAndAddress;

	@JsonProperty("LCBeneNameAndAddress")
	private String lcBeneficiaryNameAndAddress;

	@JsonProperty("LCCurrencyCode")
	private String lcCurrencyCode;

	@JsonProperty("LCAmount")
	private String lcAmount;

	@JsonProperty("LCCreditAmtTolerance1")
	private String lcCreditAmtTolerance1;

	@JsonProperty("LCAvailableWithBy")
	private String lcAvailableWithBy;

	@JsonProperty("LCDraftAt")
	private String lcDraftAt;

	@JsonProperty("LCDrawee")
	private String lcDrawee;

	@JsonProperty("LCPartialsShipment")
	private String lcPartialsShipment;

	@JsonProperty("LCTranshipmentCode")
	private String lcTranshipmentCode;

	@JsonProperty("LCPortOfLoading")
	private String lcPortOfLoading = "";

	@JsonProperty("LCPortOfDischage")
	private String lcPortOfDischarge = "";

	@JsonProperty("LCPlaceOfDispatch")
	private String lcPlaceOfDispatch = "";

	@JsonProperty("LCPlaceOfDelivery")
	private String lcPlaceOfDelivery = "";

	@JsonProperty("LCLatestDateOfShipment")
	private String lcLatestDateOfShipment;

	@JsonProperty("LCDescriptionOfGoods")
	private String lcDescriptionOfGoods;

	@JsonProperty("LCDocumentRequired")
	private String lcDocumentRequired;

	@JsonProperty("LCAdditionalCondition")
	private String lcAdditionalCondition;

	@JsonProperty("LCCharges")
	private String lcCharges;

	@JsonProperty("LCPeriodForPresentationDays")
	private String lcPeriodForPresentationDays;

	@JsonProperty("LCConfirmationInstruction")
	private String lcConfirmationInstruction;

	@JsonProperty("LCInstructionToThePaying")
	private String lcInstructionToThePaying;

	@JsonProperty("LCAdviseThroughBank")
	private String lcAdviseThroughBank;

	@JsonProperty("LCSenderToReceiverInfo")
	private String lcSenderToReceiverInfo;

	@JsonProperty("LCReimbursingBank")
	private String lcReimbursingBank;

	public String getLcSender() {
		return lcSender;
	}

	public void setLcSender(String lcSender) {
		this.lcSender = lcSender;
	}

	public String getLcReceiver() {
		return lcReceiver;
	}

	public void setLcReceiver(String lcReceiver) {
		this.lcReceiver = lcReceiver;
	}

	public String getLcMsgType() {
		return lcMsgType;
	}

	public void setLcMsgType(String lcMsgType) {
		this.lcMsgType = lcMsgType;
	}

	public String getLcMsgAdvice() {
		return lcMsgAdvice;
	}

	public void setLcMsgAdvice(String lcMsgAdvice) {
		this.lcMsgAdvice = lcMsgAdvice;
	}

	public String getLcDate() {
		return lcDate;
	}

	public void setLcDate(String lcDate) {
		this.lcDate = lcDate;
	}

	public String getLcRefNo() {
		return lcRefNo;
	}

	public void setLcRefNo(String lcRefNo) {
		this.lcRefNo = lcRefNo;
	}

	public List<String> getLcSequenceOfTotal() {
		return lcSequenceOfTotal;
	}

	public void setLcSequenceOfTotal(List<String> lcSequenceOfTotal) {
		this.lcSequenceOfTotal = lcSequenceOfTotal;
	}

	public String getLcFormOfDocumentaryCredit() {
		return lcFormOfDocumentaryCredit;
	}

	public void setLcFormOfDocumentaryCredit(String lcFormOfDocumentaryCredit) {
		this.lcFormOfDocumentaryCredit = lcFormOfDocumentaryCredit;
	}

	public String getLcTransRefNo() {
		return lcTransRefNo;
	}

	public void setLcTransRefNo(String lcTransRefNo) {
		this.lcTransRefNo = lcTransRefNo;
	}

	public String getLcDateOfIssue() {
		return lcDateOfIssue;
	}

	public void setLcDateOfIssue(String lcDateOfIssue) {
		this.lcDateOfIssue = lcDateOfIssue;
	}

	public String getLcApplicableRules() {
		return lcApplicableRules;
	}

	public void setLcApplicableRules(String lcApplicableRules) {
		this.lcApplicableRules = lcApplicableRules;
	}

	public String getLcDateExpiry() {
		return lcDateExpiry;
	}

	public void setLcDateExpiry(String lcDateExpiry) {
		this.lcDateExpiry = lcDateExpiry;
	}

	public String getLcPlaceExpiry() {
		return lcPlaceExpiry;
	}

	public void setLcPlaceExpiry(String lcPlaceExpiry) {
		this.lcPlaceExpiry = lcPlaceExpiry;
	}

	public String getLcIssuingBank() {
		return lcIssuingBank;
	}

	public void setLcIssuingBank(String lcIssuingBank) {
		this.lcIssuingBank = lcIssuingBank;
	}

	public String getLcApplicantNameAndAddress() {
		return lcApplicantNameAndAddress;
	}

	public void setLcApplicantNameAndAddress(String lcApplicantNameAndAddress) {
		this.lcApplicantNameAndAddress = lcApplicantNameAndAddress;
	}

	public String getLcBeneficiaryNameAndAddress() {
		return lcBeneficiaryNameAndAddress;
	}

	public void setLcBeneficiaryNameAndAddress(String lcBeneficiaryNameAndAddress) {
		this.lcBeneficiaryNameAndAddress = lcBeneficiaryNameAndAddress;
	}

	public String getLcCurrencyCode() {
		return lcCurrencyCode;
	}

	public void setLcCurrencyCode(String lcCurrencyCode) {
		this.lcCurrencyCode = lcCurrencyCode;
	}

	public String getLcAmount() {
		return lcAmount;
	}

	public void setLcAmount(String lcAmount) {
		this.lcAmount = lcAmount;
	}

	public String getLcCreditAmtTolerance1() {
		return lcCreditAmtTolerance1;
	}

	public void setLcCreditAmtTolerance1(String lcCreditAmtTolerance1) {
		this.lcCreditAmtTolerance1 = lcCreditAmtTolerance1;
	}

	public String getLcAvailableWithBy() {
		return lcAvailableWithBy;
	}

	public void setLcAvailableWithBy(String lcAvailableWithBy) {
		this.lcAvailableWithBy = lcAvailableWithBy;
	}

	public String getLcDraftAt() {
		return lcDraftAt;
	}

	public void setLcDraftAt(String lcDraftAt) {
		this.lcDraftAt = lcDraftAt;
	}

	public String getLcDrawee() {
		return lcDrawee;
	}

	public void setLcDrawee(String lcDrawee) {
		this.lcDrawee = lcDrawee;
	}

	public String getLcPartialsShipment() {
		return lcPartialsShipment;
	}

	public void setLcPartialsShipment(String lcPartialsShipment) {
		this.lcPartialsShipment = lcPartialsShipment;
	}

	public String getLcTranshipmentCode() {
		return lcTranshipmentCode;
	}

	public void setLcTranshipmentCode(String lcTranshipmentCode) {
		this.lcTranshipmentCode = lcTranshipmentCode;
	}

	public String getLcPortOfLoading() {
		return lcPortOfLoading;
	}

	public void setLcPortOfLoading(String lcPortOfLoading) {
		this.lcPortOfLoading = lcPortOfLoading;
	}

	public String getLcPortOfDischarge() {
		return lcPortOfDischarge;
	}

	public void setLcPortOfDischarge(String lcPortOfDischarge) {
		this.lcPortOfDischarge = lcPortOfDischarge;
	}

	public String getLcPlaceOfDispatch() {
		return lcPlaceOfDispatch;
	}

	public void setLcPlaceOfDispatch(String lcPlaceOfDispatch) {
		this.lcPlaceOfDispatch = lcPlaceOfDispatch;
	}

	public String getLcPlaceOfDelivery() {
		return lcPlaceOfDelivery;
	}

	public void setLcPlaceOfDelivery(String lcPlaceOfDelivery) {
		this.lcPlaceOfDelivery = lcPlaceOfDelivery;
	}

	public String getLcLatestDateOfShipment() {
		return lcLatestDateOfShipment;
	}

	public void setLcLatestDateOfShipment(String lcLatestDateOfShipment) {
		this.lcLatestDateOfShipment = lcLatestDateOfShipment;
	}

	public String getLcDescriptionOfGoods() {
		return lcDescriptionOfGoods;
	}

	public void setLcDescriptionOfGoods(String lcDescriptionOfGoods) {
		this.lcDescriptionOfGoods = lcDescriptionOfGoods;
	}

	public String getLcDocumentRequired() {
		return lcDocumentRequired;
	}

	public void setLcDocumentRequired(String lcDocumentRequired) {
		this.lcDocumentRequired = lcDocumentRequired;
	}

	public String getLcAdditionalCondition() {
		return lcAdditionalCondition;
	}

	public void setLcAdditionalCondition(String lcAdditionalCondition) {
		this.lcAdditionalCondition = lcAdditionalCondition;
	}

	public String getLcCharges() {
		return lcCharges;
	}

	public void setLcCharges(String lcCharges) {
		this.lcCharges = lcCharges;
	}

	public String getLcPeriodForPresentationDays() {
		return lcPeriodForPresentationDays;
	}

	public void setLcPeriodForPresentationDays(String lcPeriodForPresentationDays) {
		this.lcPeriodForPresentationDays = lcPeriodForPresentationDays;
	}

	public String getLcConfirmationInstruction() {
		return lcConfirmationInstruction;
	}

	public void setLcConfirmationInstruction(String lcConfirmationInstruction) {
		this.lcConfirmationInstruction = lcConfirmationInstruction;
	}

	public String getLcInstructionToThePaying() {
		return lcInstructionToThePaying;
	}

	public void setLcInstructionToThePaying(String lcInstructionToThePaying) {
		this.lcInstructionToThePaying = lcInstructionToThePaying;
	}

	public String getLcAdviseThroughBank() {
		return lcAdviseThroughBank;
	}

	public void setLcAdviseThroughBank(String lcAdviseThroughBank) {
		this.lcAdviseThroughBank = lcAdviseThroughBank;
	}

	public String getLcSenderToReceiverInfo() {
		return lcSenderToReceiverInfo;
	}

	public void setLcSenderToReceiverInfo(String lcSenderToReceiverInfo) {
		this.lcSenderToReceiverInfo = lcSenderToReceiverInfo;
	}

	public String getLcReimbursingBank() {
		return lcReimbursingBank;
	}

	public void setLcReimbursingBank(String lcReimbursingBank) {
		this.lcReimbursingBank = lcReimbursingBank;
	}

	@JsonProperty("boycott_status")
	private boolean lcBoycottClause;

	@JsonProperty("sanction_status")
	private boolean sanctionClauseStatus;

	@JsonProperty("incoterm")
	private String incoterm;

	@JsonProperty("shipping_method")
	private String shippingMethod;

	@JsonProperty("bill_of_lading")
	private boolean billOfLading;

	@JsonProperty("insurance_policy_status")
	private boolean insurancePolicyStatus;

	@JsonProperty("goods_name")
	private List<String> goodsName;

	@JsonProperty("quantity")
	private List<Integer> quantity;

	@JsonProperty("unit_price")
	private List<Double> unitPrice;

	@JsonProperty("lc_total_amount")
	private String totalAmount;

	@JsonProperty("lc_beneficiary_name")
	private String lcBeneficiaryName;

	@JsonProperty("lc_applicant_name")
	private String lcApplicantName;

	@JsonProperty("port_of_discharge_type")
	private boolean portOfDischarge;

	@JsonProperty("port_of_loading_type")
	private boolean portOfLoading;

	@JsonProperty("bill_of_lading_check")
	private boolean billOfLadingCheck;

	@JsonProperty("bill_of_lading_sender_name")
	private String billOfLadingSenderName;

	@JsonProperty("bill_of_lading_type")
	private String billOfLadingType;

	@JsonProperty("origin_of_goods_status")
	private boolean lcOriginOfGoods;

	@JsonProperty("transport_doc_exist")
	private boolean transportDocExist;

	@JsonProperty("lc_avl_bank")
	private String lcAvlBank;

	@JsonProperty("lc_port_check_shipping_flag")
	private boolean lcPortCheckShippingFlag;

	@JsonProperty("highlighted_text")
	private List<HighLightedText> highLightedText;

	@JsonProperty("lc_beneficiary_country")
	private String lcBeneficiaryCountry;

	@JsonProperty("lc_applicant_country")
	private String lcApplicantCountry;

	@JsonProperty("lc_beneficiary_city")
	private String lcBeneficiaryCity;

	@JsonProperty("place_of_goods")
	private List<String> placeOfGoods;

	@JsonProperty("freight_payable_status")
	private boolean freightPayableStatus;

	@JsonProperty("freight_prepaid_status")
	private boolean freightPrepaidStatus;

	@JsonProperty("dns_status")
	private boolean dnsStatus;

	@JsonProperty("dns_derived_desc")
	private String dnsDerivedDesc;

	@JsonProperty("goods_currency")
	private String goodsCurrency;

	@JsonProperty("charges_account")
	private String chargesAccount;

	@JsonProperty("charges_inside")
	private String chargesInside;

	@JsonProperty("charges_outside")
	private String chargesOutside;

	@JsonProperty("charges_country_mentioned")
	private String chargesCountryMentioned;

	@JsonProperty("dns_goods_type")
	private String dnsGoodsType;

	@JsonProperty("dns_goods_usage_list")
	private List<String> dnsGoodsUsageList;

	public boolean getLcBoycottClause() {
		return lcBoycottClause;
	}

	public void setLcBoycottClause(boolean lcBoycottClause) {
		this.lcBoycottClause = lcBoycottClause;
	}

	public boolean getSanctionClauseStatus() {
		return sanctionClauseStatus;
	}

	public void setSanctionClauseStatus(boolean sanctionClauseStatus) {
		this.sanctionClauseStatus = sanctionClauseStatus;
	}

	public String getIncoterm() {
		return incoterm;
	}

	public void setIncoterm(String incoterm) {
		this.incoterm = incoterm;
	}

	public boolean getBillOfLading() {
		return billOfLading;
	}

	public void setBillOfLading(boolean billOfLading) {
		this.billOfLading = billOfLading;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public boolean getInsurancePolicyStatus() {
		return insurancePolicyStatus;
	}

	public void setInsurancePolicyStatus(boolean insurancePolicyStatus) {
		this.insurancePolicyStatus = insurancePolicyStatus;
	}

	public List<String> getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(List<String> goodsName) {
		this.goodsName = goodsName;
	}

	public List<Double> getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(List<Double> unitPrice) {
		this.unitPrice = unitPrice;
	}

	public List<Integer> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<Integer> quantity) {
		this.quantity = quantity;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getLcBeneficiaryName() {
		return lcBeneficiaryName;
	}

	public void setLcBeneficiaryName(String lcBeneficiaryName) {
		this.lcBeneficiaryName = lcBeneficiaryName;
	}

	public boolean isPortOfDischarge() {
		return portOfDischarge;
	}

	public void setPortOfDischarge(boolean portOfDischarge) {
		this.portOfDischarge = portOfDischarge;
	}

	public boolean isPortOfLoading() {
		return portOfLoading;
	}

	public void setPortOfLoading(boolean portOfLoading) {
		this.portOfLoading = portOfLoading;
	}

	public boolean isBillOfLadingCheck() {
		return billOfLadingCheck;
	}

	public void setBillOfLadingCheck(boolean billOfLadingCheck) {
		this.billOfLadingCheck = billOfLadingCheck;
	}

	public String getBillOfLadingSenderName() {
		return billOfLadingSenderName;
	}

	public void setBillOfLadingSenderName(String billOfLadingSenderName) {
		this.billOfLadingSenderName = billOfLadingSenderName;
	}

	public String getBillOfLadingType() {
		return billOfLadingType;
	}

	public void setBillOfLadingType(String billOfLadingType) {
		this.billOfLadingType = billOfLadingType;
	}

	public boolean isLcOriginOfGoods() {
		return lcOriginOfGoods;
	}

	public void setLcOriginOfGoods(boolean lcOriginOfGoods) {
		this.lcOriginOfGoods = lcOriginOfGoods;
	}

	public boolean isTransportDocExist() {
		return transportDocExist;
	}

	public void setTransportDocExist(boolean transportDocExist) {
		this.transportDocExist = transportDocExist;
	}

	public String getLcAvlBank() {
		return lcAvlBank;
	}

	public void setLcAvlBank(String lcAvlBank) {
		this.lcAvlBank = lcAvlBank;
	}

	public boolean isLcPortCheckShippingFlag() {
		return lcPortCheckShippingFlag;
	}

	public void setLcPortCheckShippingFlag(boolean lcPortCheckShippingFlag) {
		this.lcPortCheckShippingFlag = lcPortCheckShippingFlag;
	}

	public List<HighLightedText> getHighLightedText() {
		return highLightedText;
	}

	public void setHighLightedText(List<HighLightedText> highLightedText) {
		this.highLightedText = highLightedText;
	}

	public String getLcBeneficiaryCountry() {
		return lcBeneficiaryCountry;
	}

	public void setLcBeneficiaryCountry(String lcBeneficiaryCountry) {
		this.lcBeneficiaryCountry = lcBeneficiaryCountry;
	}

	public String getLcBeneficiaryCity() {
		return lcBeneficiaryCity;
	}

	public void setLcBeneficiaryCity(String lcBeneficiaryCity) {
		this.lcBeneficiaryCity = lcBeneficiaryCity;
	}

	public List<String> getPlaceOfGoods() {
		return placeOfGoods;
	}

	public void setPlaceOfGoods(List<String> placeOfGoods) {
		this.placeOfGoods = placeOfGoods;
	}

	public boolean isFreightPayableStatus() {
		return freightPayableStatus;
	}

	public void setFreightPayableStatus(boolean freightPayableStatus) {
		this.freightPayableStatus = freightPayableStatus;
	}

	public boolean isFreightPrepaidStatus() {
		return freightPrepaidStatus;
	}

	public void setFreightPrepaidStatus(boolean freightPrepaidStatus) {
		this.freightPrepaidStatus = freightPrepaidStatus;
	}

	public boolean isDnsStatus() {
		return dnsStatus;
	}

	public void setDnsStatus(boolean dnsStatus) {
		this.dnsStatus = dnsStatus;
	}

	public String getDnsDerivedDesc() {
		return dnsDerivedDesc;
	}

	public void setDnsDerivedDesc(String dnsDerivedDesc) {
		this.dnsDerivedDesc = dnsDerivedDesc;
	}

	public String getLcApplicantName() {
		return lcApplicantName;
	}

	public void setLcApplicantName(String lcApplicantName) {
		this.lcApplicantName = lcApplicantName;
	}

	public String getGoodsCurrency() {
		return goodsCurrency;
	}

	public void setGoodsCurrency(String goodsCurrency) {
		this.goodsCurrency = goodsCurrency;
	}

	public String getChargesAccount() {
		return chargesAccount;
	}

	public void setChargesAccount(String chargesAccount) {
		this.chargesAccount = chargesAccount;
	}

	public String getLcApplicantCountry() {
		return lcApplicantCountry;
	}

	public void setLcApplicantCountry(String lcApplicantCountry) {
		this.lcApplicantCountry = lcApplicantCountry;
	}

	public String getChargesInside() {
		return chargesInside;
	}

	public void setChargesInside(String chargesInside) {
		this.chargesInside = chargesInside;
	}

	public String getChargesOutside() {
		return chargesOutside;
	}

	public void setChargesOutside(String chargesOutside) {
		this.chargesOutside = chargesOutside;
	}

	public String getChargesCountryMentioned() {
		return chargesCountryMentioned;
	}

	public void setChargesCountryMentioned(String chargesCountryMentioned) {
		this.chargesCountryMentioned = chargesCountryMentioned;
	}

	public String getDnsGoodsType() {
		return dnsGoodsType;
	}

	public void setDnsGoodsType(String dnsGoodsType) {
		this.dnsGoodsType = dnsGoodsType;
	}

	public List<String> getDnsGoodsUsageList() {
		return dnsGoodsUsageList;
	}

	public void setDnsGoodsUsageList(List<String> dnsGoodsUsageList) {
		this.dnsGoodsUsageList = dnsGoodsUsageList;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

}
