package com.careerdevs.interm;

public class Classes {
    public String text = "";


    public static void main(String[] args) throws IllegalAccessException {
//        var employee = new Employee(); //coupling
//        employee.setBaseSalary(50_000);//coupling point
//        employee.setHourlyRate(20); //coupling point
//        int wage = employee.calculateWage(100); //coupling point
//        System.out.println(wage);

//        var browser = new Browser();
//       browser.navigate("127.0.0.1");

        var employee = new Employee(50_000, 20);
        //var employee2 = new Employee(50_000);
        System.out.println(Employee.numberOfEmployees); //static field access.
        int wage   = employee.calculateWage(10);
        System.out.println(wage);

        var browser = new Browser();
       browser.navigate("127.0.0.1");


    }


    public static void B_02_01() {
        /*
        classes
        principles encapsulate and abstraction constructions getters setters
        method overloading
         */
    }

    public static void B_02_02_classesObjects() {
        /*
        Class is a blueprint
        Object is an instance of a class
        Fields
        Methods = these can change the value of a field variable
         */

    }

    public void B_02_03creatingClassesSetText(String text) {
        this.text = text;
        // three members => two methods and one field
    }

    public void B_02_03creatingClassesClear() {
        text = "";
        // three members => two methods and one field
    }

    public void B_02_04creatingObjects() {
        /*
        var textBox1 = new TextBox();
        textBox.setText("Box 1");
        System.out.println(textBox1.text)

        set String text to "" and we will never get null. null can break our code

        var textBox2 = new TextBox();
        textBox.setText("Box 2");
        System.out.println(textBox2.text)

        output:
        Box 1
        Box 2
        You can see the state or the data in each instance of TextBoX()
         */

    }

    public static void B_02_05memoryAllocation() {
        /*
        heap => objects
        stack => primitives and short-lived variables => and references to objects on the heap
        var textBox1 = new TextBox();
        creates a new textBox object and stores it on the heap.
        example 100 address;
        textBox1 is referencing an object on the heap. These variables are reference types => they do not store the
        values. non-primitive

        primitive => they are stored on the stack and will be in that mem location

        example of anther concept;
         var textBox1 = new TextBox();
         var textBox2 = textBox1;
         textBox2.setText("Hello World");
         System.out.println(textBox1.text);

         this sout will print Hello World. THey both point to the same object.

        de-allocation
         Exit a method -> runtime will remove all the variables on the stack.
         objects on the heap with no reference =>  Object will be removed over time => garbage collector
         */
    }

    public static void B_02_06proceduralProgramming() {
        /*
        created calculate wage and put a lot of code in main => procedural programming
         */

    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public static void B_02_07encapsulation(){
        /*
        created a new class called employee
         */
    }

    public static void B_02_08gettersSetters(){
        /*
        created getters and setters in Employee class.
         */
    }

    public static void B_02_09abstraction(){
        /*
        created abstraction examples
        ****Reduce the complexity by hiding unnecessary details*****
        hide the implementation detail of the class and treat it like a black box.
        We don't care on what's inside. A simple interface
         */
    }

    public static void B_02_10coupling(){
        /*
      coupling
       the level of dependency between classes
       use your phone => you are coupled
       You want to reduce the coupling

         */
    }


    public static void B_02_11reduceCoupling(){
        /*
      coupling
       the level of dependency between classes
       use your phone => you are coupled
       You want to reduce the coupling
         */
    }

    public static void B_02_12constructors(){
        /*
        create a constructor for employee
         */
    }

    public static void B_02_13methodOverloading(){
        /*
        create a loading by adding constructors
           overloaded calculate Wages
           do not over use it and the example here is great practice bc it doesn't buy you much.
           overload methods parameter should be really different.
         */
    }


    public static void B_02_14constructorsOverloading (){
        /*
        create constructor overloading


         */
    }

    public static void B_02_15staticMember(){
        /** *********************
        create Static members and instance members
            static fields and methods
            OOP can have two types of members => instance members and static members
            instance members belong to object or instances => employee class is an example. the fields belong to each
             instance of the employee class.

             use a static fields when sharing across all objects = independent.
             static method scope is it can only see other static methods.

             *********the main method is always static because it doesn't have to create a new object from java run
             time.

         */
    }

    public static void B_02_16_testing(){
        /*

Java program to illustrate
loose coupling concept

public interface Topic
{
    void understand();
}
class Topic1 implements Topic {
public void understand()
    {
        System.out.println("Got it");
    }
} class Topic2 implements Topic {
public void understand()
    {
        System.out.println("understand");
    }
} public class Subject {
public static void main(String[] args)
    {
        Topic t = new Topic1();
        t.understand();
    }
}
         */
    }




}
