package problems;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Text {

    public void currencyFormatter(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency to be formatted: ");
        double payment = scanner.nextDouble();
        scanner.close();

        // NumberFormat instances for different locales
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Formatting the payment according to the different locales
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        // Write your code here.
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
