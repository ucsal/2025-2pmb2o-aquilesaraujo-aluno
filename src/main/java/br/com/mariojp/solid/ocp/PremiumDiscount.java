package br.com.mariojp.solid.ocp;

public class PremiumDiscount implements Discount {
public CustomerType type;
	
	public PremiumDiscount() {
		this.type = type.PREMIUM;
	}
	
	public double apply(double amount) {
		return amount * 0.90;
	}
}
