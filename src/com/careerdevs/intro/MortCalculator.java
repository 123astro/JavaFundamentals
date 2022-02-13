package com.careerdevs.intro;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortCalculator {
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000); // originally a double
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 30); // case to float bc it is a double
        byte years = (byte) readNumber("Years: ", 1, 30); // double cast to byte

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static double calculateBalance(int principal,
                                          float annualInterest,
                                          byte years,
                                          short numberOfPaymentsMade) {

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR); // cast result to short
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double balance = principal
                * ((Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest,
                numberOfPayments) - 1));
        return balance;

    }

    public static double calculateMortgage(
            int principal,  // break the method down allowing you can see all the parameters in a clean fashion.
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR); // cast result to short

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest
                        , numberOfPayments) - 1));
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + NumberFormat.getCurrencyInstance().format(mortgage));
        System.out.println("Payment Schedule\n" + "------------");
        return mortgage;
    }


    public static double readNumber(String prompt, double min, double max) {  // made one generic method to handle all
        // the inputs
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

}
