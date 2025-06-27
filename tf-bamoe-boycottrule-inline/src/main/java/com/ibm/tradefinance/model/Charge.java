package com.ibm.tradefinance.model;

import java.util.Objects;

public class Charge {

	private String chargeCode;
	private double chargeAmount;
	private String chargeCurrency;

	public String getChargeCode() {
		return chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getChargeCurrency() {
		return chargeCurrency;
	}

	public void setChargeCurrency(String chargeCurrency) {
		this.chargeCurrency = chargeCurrency;
	}

	public Charge() {
		super();
		
	}

	public Charge(String chargeCode, double chargeAmount, String chargeCurrency) {
		super();
		this.chargeCode = chargeCode;
		this.chargeAmount = chargeAmount;
		this.chargeCurrency = chargeCurrency;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Charge that = (Charge) o;
		return Objects.equals(chargeCode, that.chargeCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(chargeCode);
	}

	@Override
	public String toString() {
		return "Charge [chargeCode=" + chargeCode + ", chargeAmount=" + chargeAmount + ", chargeCurrency="
				+ chargeCurrency + "]";
	}



}
