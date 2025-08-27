package br.com.mariojp.solid.ocp;

public class RegularDiscount implements Discount {
	public CustomerType type;
	
	public RegularDiscount() {
		this.type = type.REGULAR;
	}
	
	public double apply(double amount) {
		return amount * 0.95;
	}
}
