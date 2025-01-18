public class CurrencyConverter {
    public static double convert(double price, double quantityDollar) {
        double total = price * quantityDollar;
        double percent = 6.00 / 100 * total;
        return total + percent;
    }
}
