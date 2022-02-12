package com.careerdevs.interm;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage( int extraHours){  //calculate wage has less parameters now => encapsulate the value in a
        // single
        // object.
        return baseSalary + (hourlyRate * extraHours);
    }
}
