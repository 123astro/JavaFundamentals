package com.careerdevs.intro;

public class Debugging {
    public static void main(String[] args) {

    }
        public static void A_05_01_Intro() {
        /*
        Finding and Fixing errors
        Types of errors
        Common errors
        Debugging
        Packaging
         */
    }

    public static void A_05_02_typesOfErrors(){

        /*
        Run time errors - debugger line by line
        vs
        compiler errors  - intelij will find these
         */

    }

    public static void A_05_03_commonSyntaxErrors(){
        /*
        Specify data type when declaring a new variable.
        name = "Mosh";  => error
        String name = "Mosh";
        make sure to use semi-colin
        " " when using a String
        Cap a variable - you will get a compilation error. Case-sensitive
        No single = to compare values => assignment operator

         */
    }

    public static void A_05_04_debuggingJavaApps(){
        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");
    }
    public static void printNumbers(int limit){
        for (int i = 0; i <= limit; i += 1)
            System.out.println(i);
    }


    public static void A_05_05_packagingJavaApp(){
        System.out.println("Hello World");

        /*
        Creating a jar file using project structure > artifacts > "+"  > jar modules with dependency > create the jar
         file > go to build menu and build artifacts > goto project panel > artifacts and open in terminal>
         # java -jar HellowWorld.jar
         */
    }
}
