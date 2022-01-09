package com.careerdevs.intro;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
        //A-02-02
        // types
        // Variables and constant
        // Primitive and Reference Types
        // Casting
        //Numbers, Strings and Array
        // Read input from a user - scanner

        //int age = 30; whole numbers only  age is the name or the identifier and = is assignment operator
        // the above example is initializing the variable because we assigned it a value in memory.
        // if no value was assigned, we are declaring the variable age.

    }

    public static void a2_02_var() {  // no need to instantiate with static method
        int age = 30;
        age = 35;
        System.out.println(age);
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);
    }

    //A-02-03
    // types Primitive types and Reference types.
    // Primitive = storing simple values
    //Reference is for storing Complex Objects

    //primitive byte 1 byte, short 2 bytes, int 4, long 8.
    //float 4, double 8, char 2 bytes, boolean 1 byte.

    //primitive data types are below

    public static void a2_03_var() {  // no need to instantiate with static method
        byte age = 30;
        int viewsCount = 123_456_789; // under score for comma
        long viewsCount2 = 3_123_456_789L; // Long
        float price = 10.99F; //JAVA sees this as a double = so you need to add the F suffix.
        char letter = 'a'; // single quotes
        boolean isEligible = false; // words in orange are revered keywords.
    }

    //reference types  example mail messages, date
    // there are eight primitive types and all the rest are reference types.

    public static void a2_04_var() {  // no need to instantiate with static method
        byte age = 30;
        Date now = new Date(); // packages create a namespace for our packages imports the data class into
        // this package
        System.out.println(now);  // sout is a code snippet
        now.getTime();  //reference types have members -> this example .getTime() is a member of .getTime().
    }


    //PRIMITIVE (storing simple values) VS REFERENCE (storing complex objects)

    public static void a2_05_var() {  // no need to instantiate with static method
        byte x = 1;  // x and y are completely independent of each other in this example
        byte y = x;
        x = 2;
        System.out.println(y);
        System.out.println(x);

        Point point1 = new Point(1,1);  // allocates the memory space and point1 holds the address of the memory space
        Point point2 = point1;   // it holds the point object address in memory - not the actual object - hence
        // reference type // point1 and point2 are referencing the same point object in memory. They are referencing
        // the same object - they are not independent of each other. If you change one - they both change.
        point1.x = 2;
        System.out.println(point2);  //java.awt.Point[x=2,y=1]  x is now 2. The change was visible.
        //reference types are copied by their references  and primitive types are copied by their value.
    }

    //Strings a-02-06;

    public static void a2_06_var() {
        //String message = new String("Hello World"); // another way below.
        String message2 = "Hello World" + "!!";
        String message3 = "  Hello World" + "!!  "; // trim example
        System.out.println(message2);
        System.out.println(message2.endsWith("!!"));
        System.out.println(message2.startsWith("!!"));
        System.out.println(message2.length()); //counts a spaces
        System.out.println(message2.indexOf("H"));
        System.out.println(message2.indexOf("!"));
        System.out.println(message2.replace("!", "*")); // arguments are actual values we pass to the methods.
        // parameters are the holes defined in our methods.
        System.out.println(message2); // prints the original bc strings are immutable. Any method that modifies a
        // string will always return a new string object.
        System.out.println(message2.toLowerCase(Locale.ROOT));
        System.out.println(message3);
        System.out.println(message3.trim()); // trim white spaces at the beginning and end.

    }

}
