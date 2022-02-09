package com.careerdevs.intro;

import java.text.NumberFormat;
import java.util.Scanner;

public class CleanCoding {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        // good programmers write clean code that humans can understand !
        // make it clean and beautiful


    }

    public static void a4_02_cleanCoding() {
        //chunks need to be used - streamline code
        // create new types of methods for clean code!!!!
        // generic code allowing it to be reusable
    }

    public static void a4_03_creatingMethods() {
        // greet

        //public static void greetUser(String firstName, String lastName){
        // System.out.println("Hello " + firstName + " " + lastName);
        // instantiate  greetUser(name: "Mosh', "Hamedani")'
        //
        // Another way
        //public static String greetUser(String firstName, String lastName){
        //  return "Hello " + firstName + " " + lastName;

        // instantiate in main
        // String message = greetUser(name: "Mosh', "Hamedani")'

    }

    public static void A_4_04_refactoring() {
        // refactoring means changing the structure of our code without changing its behavior
        // refactor mortgage cal based on the amount of code.  Methods should be 5 to 10 lines of code and no more
        // than 20.

    }

    public static void A_4_05_extractingMethods() {

        int principal = 0; // rescope bc outside the block
        float annualInterest = 0;
        byte years;

        Scanner scanner = new Scanner(System.in);

        while (true) { // the scope of principle changed and needed to be put into the field of the method.
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        while (true) {
            System.out.print("Period in Years: ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and less than or equal to 30.");
        }

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Extracting Methods - Mortgage: " + mortgageFormatted);

    }

    public static double calculateBalance(int principal,
                                          float annualInterest,
                                          byte years,
                                          short numberOfPaymentsMade) {

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR); // cast result to short
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentsMade) / (Math.pow(1 + monthlyInterest,
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


    public static void A_4_06_refactoringRepetitivePatterns() {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000); // originally a double
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 30); // case to float bc it is a double
        byte years = (byte) readNumber("Years: ", 1, 30); // double cast to byte

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Refactoring Repetitive Patterns - Mortgage: " + mortgageFormatted);
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


    public static void A_4_07_projectPaymentSchedule() {
        // add MORTGAGE
        //     _______
        // Monthly payments: $1,822.41
        // Payment schedule
        // ----------------
        // The remaining balance after each monthly payment
        //  With a 10years loan we would have 120 payment  => 12 months per year
        //  Calculate the remaining balance B= L[(1 + C)^N - (1 + C)^P]/[(1 + C)^N - 1]
        // L is principle, c is monthly interest, n is the number of payments, p is the
        // number of payments made,
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000); // originally a double
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 30); // case to float bc it is a double
        byte years = (byte) readNumber("Years: ", 1, 30); // double cast to byte

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principal,annualInterest,years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }

    }

    public static void schedule() {


    }

    public static void A_4_08_solution() {

    }

    public static void A_4_09_refactoringTheCode() {

    }

    public static void A_4_10_summary() {

    }


}
