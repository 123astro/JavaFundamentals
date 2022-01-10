package com.careerdevs.intro;

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
            System.out.println("Hello World" + i );
        }
        for (int i = 5; i > 0; i--) { // initializing i to 0 || then evaluates the i < 5 || i is incremented by 1
            System.out.println("Hello World" + i );
        }
    }

    public static void A_03_10_whileLoops() {

    }

    public static void A_03_11_doWhileLoops() {

    }

    public static void A_03_12_breakAndContinue() {

    }

    public static void A_03_13_for_eachLoop() {

    }

    public static void A_03_14_mortgage_calculator() {

    }

    public static void A_03_15_mortgage_calculator_solution() {

    }

    public static void A_03_16_summary() {

    }

}
