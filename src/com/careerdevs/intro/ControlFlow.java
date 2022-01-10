package com.careerdevs.intro;

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
        boolean isEligible1 =(hasHighIncome1 || hasGoodCredit1) && !hasCriminalRecord;
        System.out.println("Is eligible: " + isEligible1);
    }
}
