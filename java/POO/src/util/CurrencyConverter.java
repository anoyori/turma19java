package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double dollar, double bought) {
		return bought * dollar *(1.0+IOF);
	}

}
