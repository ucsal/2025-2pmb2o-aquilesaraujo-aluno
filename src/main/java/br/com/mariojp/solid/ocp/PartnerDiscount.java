package br.com.mariojp.solid.ocp;

public class PartnerDiscount implements Discount {
public CustomerType type;
	
	public PartnerDiscount() {
		this.type = type.PARTNER;
	}
	
	public double apply(double amount) {
		return amount * 0.88;
	}
}
