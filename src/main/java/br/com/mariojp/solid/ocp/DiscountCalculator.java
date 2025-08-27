package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
	
	private final Map<CustomerType, Discount> discounts = new HashMap<CustomerType, Discount>();
	
	public DiscountCalculator() {
		discounts.put(CustomerType.REGULAR, new RegularDiscount());
		discounts.put(CustomerType.PREMIUM, new PremiumDiscount());
		discounts.put(CustomerType.PARTNER, new PartnerDiscount());
	}
	
    public double apply(double amount, CustomerType type){
    	return discounts.getOrDefault(type, a -> a).apply(amount);
    }
}
