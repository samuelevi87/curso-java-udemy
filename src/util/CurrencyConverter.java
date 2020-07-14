package util;

public class CurrencyConverter {
	public static double priceQuotation;
	public static double ammount;
	public static final double taxIof = 6.0;
	
	public static double conversion() {
		return ammount * priceQuotation + (ammount *priceQuotation * (taxIof/100));
	}

}
