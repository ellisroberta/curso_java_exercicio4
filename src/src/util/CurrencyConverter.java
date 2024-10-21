package util;

public class CurrencyConverter {

    public static double dollarToReal(double dollar, double quantity) {
        return dollar * quantity * 1.06;
    }
}
