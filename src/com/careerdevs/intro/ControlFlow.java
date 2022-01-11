package com.careerdevs.intro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        // A- 03-01 Flow Control intro
        // Comparison Operators comparing values
        // Logical operators logical and or not
        // Conditional Statements  making decisions
        //loops  execution of code repeatedly


    }

    // comparison operators
    public static void A_03_02_comparisonOperators() {
        int x = 1;
        int y = 1;
        System.out.println("comparison op: " + (x == y)); //boolean value is produced
        System.out.println("comparison op: " + (x != y));
        System.out.println("comparison op: " + (x <= y));

    }

    public static void A_03_03_logicalOperators() {
        int temperature = 12;
        boolean isWarm = (temperature > 20 && temperature < 30);
        System.out.println("logical op: " + isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println("Is eligible: " + isEligible);

        boolean hasHighIncome1 = false;  // needs high income or good credit
        boolean hasGoodCredit1 = true;
        boolean hasCriminalRecord = false; // needs not to be a criminal
        boolean isEligible1 = (hasHighIncome1 || hasGoodCredit1) && !hasCriminalRecord;
        System.out.println("Is eligible: " + isEligible1);
    }

    public static void A_03_04_ifStatements() {
        int temp = 32;
        if (temp > 30) {  // parent followed by two children also look at formatting
            System.out.println("Its a hot day");
            System.out.println("Drink Water");
        } else if (temp > 20)
            System.out.println("Beautiful Day");
        else
            System.out.println("Cold day");
    }


    public static void A_03_05_simplifyingIfStatements() {
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
    }

    public static void A_03_06_theTernaryOperator() {
        int income = 120_000;
        String className = "Economy";
        if (income > 100_00)
            className = "First";
        System.out.println("Class: " + className);

        String className1 = income > 100_00 ? "First" : "Economy";  // ternary Operator!! awesome
        System.out.println("Class: " + className1);
    }

    public static void A_03_07_switchStatements() {
        String role = "admin";
        if (role == "admin")
            System.out.println("You are an admin");
        else if (role == "moderator")
            System.out.println("You are a moderator");
        else
            System.out.println("You are a guest");

        role = "moderator";

        switch (role) {
            case "admin":
                System.out.println("you are an admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }
        int role1 = 0;

        switch (role1) {
            case 1:
                System.out.println("you are an admin");
                break;
            case 2:
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }
    }

    // Number divisible
    // if divides by 5  = fizz
    // if divides by 3 =  buzz
    // if divides by 3 and 5  like 15 or 30  fizzbuzz
    // if can't divide by 3 or 5 = repeat number

    public static void A_03_08_exercise_FizzBuzz() {
        Scanner scanner = new Scanner(System.in);  // I originally didn't use a scanner but added one - never said to :)
        System.out.print("Please enter a number: ");  // my original code had no nesting !!!!  NO IF IF statements
        // in a row
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("fizzbuzz");
        } else if (number % 3 == 0) {
            System.out.println("buzz");
        } else if (number % 5 == 0) {
            System.out.println("fizz");
        } else {
            System.out.println(number);
        }
    }


    public static void A_03_09_forLoops() {
        for (int i = 0; i < 5; i++) { // initializing i to 0 || then evaluates the i < 5 || i is incremented by 1
            System.out.println("Hello World" + i);
        }
        for (int i = 5; i > 0; i--) { // initializing i to 0 || then evaluates the i < 5 || i is incremented by 1
            System.out.println("Hello World" + i);
        }
    }

    public static void A_03_10_whileLoops() {  // while loops are used when you don't know how many times you want to
        // repeat something. Remember, you can not use comparison operators when comparing reference types.
        int i = 5;
        while (i > 0) {
            System.out.println("While Loop : Hello World" + i);
            i--;
        }

        Scanner scanner1 = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input (type quit to end - whileLoop): ");
            input = scanner1.nextLine().toLowerCase(Locale.ROOT);
            System.out.println(input);
        }

    }

    public static void A_03_11_doWhileLoops() {// use only when you need at least one execution of the code block.
        Scanner scanner2 = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Input (type quit to end - doWhileLoop): ");
            input = scanner2.next().toLowerCase(Locale.ROOT);
            System.out.println(input);
        } while (!input.equals("quit"));
    }

    public static void A_03_12_breakAndContinue() {
        Scanner scanner2 = new Scanner(System.in);
        String input1 = "";
        while (!input1.equals("quit")) {
            System.out.println("Input (type quit to end - break and continue usage): ");
            input1 = scanner2.nextLine().toLowerCase(Locale.ROOT);
            if (input1.equals("pass"))
                continue; // brings us back to the top of the loop or moves control to the beginning of the loop
            if (input1.equals("quit"))
                break;  // when java see the break statement = terminate loop
            System.out.println(input1);
        }

        Scanner scanner3 = new Scanner(System.in);
        String input2 = "";
        while (true) { // edit from above code // pros use the true bc break will quit the program
            System.out.println("Input (type quit to end - break and continue usage with always true ): ");
            input2 = scanner2.nextLine().toLowerCase(Locale.ROOT);
            if (input2.equals("pass"))
                continue; // brings us back to the top of the loop or moves control to the beginning of the loop
            if (input2.equals("quit"))
                break;  // when java see the break statement = terminate loop - without break you will get infinite loop
            System.out.println(input1);
        }
    }

    public static void A_03_13_for_eachLoop() {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits) {  // fruit of 0, fruit of 1, fruit or 2 will now print in sequence.
            System.out.println(fruit);  // limitations => forward only, we can not iterate for the last index to
            // index 0.
        }

    }

    public static void A_03_14_mortgage_calculator_error_handling() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        float monthlyInterest;
        float annualInterest;
        byte years;
        int numberOfPayments;
        double monthlyPayment;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal < 1000 || principal > 1_000_000) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                continue;
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest <= 0 || annualInterest > 30) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                continue;
            } else {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
        }


        while (true) {
            System.out.print("Period in Years: ");
            years = scanner.nextByte();
            if (years <= 0 || years > 30) {
                System.out.println("Enter a value between 1 and less than or equal to 30.");
                continue;
            } else {
                numberOfPayments = years * MONTHS_IN_YEAR;
                monthlyPayment = principal *
                        ((monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))) / ((Math.pow(1 + monthlyInterest
                                , numberOfPayments) - 1)));
                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
                System.out.println("Mortgage: " + mortgageFormatted);
                break;
            }
        }
    }

    public static void A_03_15_mortgage_calculator_solution() {

    }

    public static void A_03_16_summary() {

    }

}
