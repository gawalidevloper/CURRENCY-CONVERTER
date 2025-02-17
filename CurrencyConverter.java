import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> rates = new HashMap<>();
        rates.put("INR", 1.0);
        rates.put("USD", 0.012);  // 1 INR = 0.012 USD
        rates.put("EUR", 0.011);  // 1 INR = 0.011 EUR
        rates.put("GBP", 0.0095); // 1 INR = 0.0095 GBP
        rates.put("JPY", 1.78);   // 1 INR = 1.78 JPY
        rates.put("AUD", 0.018);  // 1 INR = 0.018 AUD

        System.out.println("Available Currencies: INR, USD, EUR, GBP, JPY, AUD");
        String base = "INR"; 
        System.out.print("Enter target currency: ");
        String target = sc.next().toUpperCase();
        System.out.print("Enter amount in INR: ");
        double amount = sc.nextDouble();

        if (!rates.containsKey(target)) {
            System.out.println("Invalid currency! Try again.");
            return;
        }

        double convertedAmount = amount * rates.get(target);

        System.out.printf("\n%.2f INR = %.2f %s\n", amount, convertedAmount, target);

        sc.close();
    }
}