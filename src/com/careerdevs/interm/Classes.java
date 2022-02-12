package com.careerdevs.interm;

public class Classes {
    public String text = "";


    public static void main(String[] args) throws IllegalAccessException {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(100);
        System.out.println(wage);
    }


    public static void B_02_01() {
        /*
        classes
        principles encap and abstration constructions getters setters
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

    public static void B_02_08gettes_setters(){
        /*
        created getters and setters in Employee class.
         */
    }


}
