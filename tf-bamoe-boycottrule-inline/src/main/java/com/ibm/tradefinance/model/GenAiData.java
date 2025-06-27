package com.ibm.tradefinance.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenAiData {

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

	@Override
	public String toString() {
		return "GenAiData [lcBoycottClause=" + lcBoycottClause + ", sanctionClauseStatus=" + sanctionClauseStatus
				+ ", incoterm=" + incoterm + ", shippingMethod=" + shippingMethod + ", billOfLading=" + billOfLading
				+ ", insurancePolicyStatus=" + insurancePolicyStatus + ", goodsName=" + goodsName + ", quantity="
				+ quantity + ", unitPrice=" + unitPrice + ", totalAmount=" + totalAmount + ", lcBeneficiaryName="
				+ lcBeneficiaryName + ", lcApplicantName=" + lcApplicantName + ", portOfDischarge=" + portOfDischarge
				+ ", portOfLoading=" + portOfLoading + ", billOfLadingCheck=" + billOfLadingCheck
				+ ", billOfLadingSenderName=" + billOfLadingSenderName + ", billOfLadingType=" + billOfLadingType
				+ ", lcOriginOfGoods=" + lcOriginOfGoods + ", transportDocExist=" + transportDocExist + ", lcAvlBank="
				+ lcAvlBank + ", lcPortCheckShippingFlag=" + lcPortCheckShippingFlag + ", highLightedText="
				+ highLightedText + ", lcBeneficiaryCountry=" + lcBeneficiaryCountry + ", lcApplicantCountry="
				+ lcApplicantCountry + ", lcBeneficiaryCity=" + lcBeneficiaryCity + ", placeOfGoods=" + placeOfGoods
				+ ", freightPayableStatus=" + freightPayableStatus + ", freightPrepaidStatus=" + freightPrepaidStatus
				+ ", dnsStatus=" + dnsStatus + ", dnsDerivedDesc=" + dnsDerivedDesc + ", goodsCurrency=" + goodsCurrency
				+ ", chargesAccount=" + chargesAccount + ", chargesInside=" + chargesInside + ", chargesOutside="
				+ chargesOutside + ", chargesCountryMentioned=" + chargesCountryMentioned + ", dnsGoodsType="
				+ dnsGoodsType + ", dnsGoodsUsageList=" + dnsGoodsUsageList + "]";
	}

}