package com.careerdevs.interm;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary) throws IllegalAccessException {
        this(baseSalary, 0); // this calls the second constructor

    }

    public Employee(int baseSalary, int hourlyRate) throws IllegalAccessException {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){  //calculateWage has fewer parameters now => encapsulate the value in a
        // single object.
        return baseSalary + (getHourlyRate() * extraHours);
    }
    public int calculateWage(){  //calculateWage has fewer parameters now => encapsulate the value in a
        // single object.
        return calculateWage(0);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) throws IllegalAccessException {
        if ( baseSalary <= 0 ) {
            throw new IllegalAccessException("Salary can not be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) throws IllegalAccessException{
        if( hourlyRate < 0 ){
           throw new IllegalAccessException("Can't be less than or equal to 0");
        }
        this.hourlyRate = hourlyRate;
    }
}
