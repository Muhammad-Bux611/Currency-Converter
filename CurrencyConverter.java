import java.util.Scanner;

class CurrencyConverter {

    // Exchange rates (example rates: 1 USD = 0.85 EUR, 1 USD = 110 JPY)
    static double usdToEurRate = 0.85;
    static double usdToJpyRate = 110.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        double eurAmount = convertToEUR(usdAmount);
        double jpyAmount = convertToJPY(usdAmount);

        System.out.println(usdAmount + " USD is equal to " + eurAmount + " EUR");
        System.out.println(usdAmount + " USD is equal to " + jpyAmount + " JPY");

        scanner.close();
    }

    public static double convertToEUR(double usdAmount) {
        return usdAmount * usdToEurRate;
    }

    public static double convertToJPY(double usdAmount) {
        return usdAmount * usdToJpyRate;
    }
}
