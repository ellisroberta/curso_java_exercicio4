package util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double dollar, double quantity) {
        return dollar * quantity * (1.0 + IOF);
    }
}
