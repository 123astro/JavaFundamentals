package com.careerdevs.intro;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
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

        Point point1 = new Point(1, 1);  // allocates the memory space and point1 holds the address of the memory space
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
    //Escape Sequences
    //A-02-07

    public static void a2_07_var() {

        String message = "Hello \"Mosh\"";  //double quotes you need to be aware of
        System.out.println(message);
        // C:\Windows\..
        String message1 = "c: \\Windows\\.."; // two backslashes in code but only one prints
        System.out.println(message1);

        String message2 = "c: \nWindows\\.."; // \n is a new line
        System.out.println(message2);

        String message3 = "c: \tWindows\\.."; // \t is a tab
        System.out.println(message3);

    }

    //Arrays  => stores a list of items, list of people, a list of messages
    //Arrays have a fixed length
    //A-02-08
    public static void a2_08_var() {
        int[] numbers = new int[5]; // bracket notation
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 3;  // throws an exception
        System.out.println(numbers); // prints the address of object in memory
        System.out.println(Arrays.toString(numbers)); //the other index that are not initialized are set to 0 be default.

        // the new way to do the same as above
        int[] numbers2 ={2,3,5,1,4};  // arrays have a fixed length - use a collection class if you need to remove
        // and change the size
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

    }
    //Multi-dimensional Arrays
    //A-02-09

    public static void a2_09_var() {
        // int[] numbers = new int[5]; single dimensional array
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers)); // use the deepToString to print multi dim

        int[][] numbers2 = {{1,2,3} , {4,5,6}};
        System.out.println(Arrays.deepToString(numbers2));

    }

    //Constants
    //A-02-10

    public static void a2_010_var() {
        final float PI = 3.14f; // final so pi can't change or be set to another value
        //PI = 2.3F; // ERROR bc you can't change a final.
    }


    //Arithmetic Expressions
    // A-02-11;
    public static void a2_011_var() {
        int result = 10 + 3;
        int result1 = 10 - 3; // 10 and 3 are call operands  and - is the operator
        int result2 = 10 / 3; // will only give you a whole number answer
        double result3 = (double) 10 / (double) 3; // this is an expression that produces a value.
        int x = 1;
        ++x;  //increment operator
        x++;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(x);

        int xx = 1;
        int y = xx++;  // xx assigns y a value then xx is incremented
        System.out.println(xx);
        System.out.println(y);

        int xxx = 1;
        int yy = ++xxx;  // xxx is incremented then assigned to yy
        System.out.println("xxx is: " + xxx);
        System.out.println("yy is: " + yy);

        int xxxx = 1;
        xxxx += 2; //augmented (or compound) assignment operator
        System.out.println(xxxx);
    }

    //A-02-12-Order of Operations
    public static void a2_012_var() {
        int x = 10 + 3 * 2; // 3*2 has the highest priority  result is 16
        int y = (10 + 3) * 2;
        System.out.println(x);
        System.out.println(y);

    }

    //A-02-13-Casting and type conversion
    // byte > short > int > long > float > double
    // implicit casting only happens when data will not be lost
    public static void a2_013_casting() {
        short x = 1;
        int y = x + 2;  // java will automatic implicit casting x and be converted to the bigger int.
        System.out.println("casting example 1: " + y);

        double xx = 1.1;
        double yy = xx + 2; // java casts the 2 int to a double 2.0.
        System.out.println(yy);

        double xxx = 1.1;
        int yyy = (int) xxx + 2; // explicit casting = convert xxx from double to int
        System.out.println(yyy);

        String xxxx = "1";
        int yyyy =  Integer.parseInt(xxxx) + 2;
        System.out.println(yyyy);


        String xxxxx = "1.1";
        double yyyyy  =  Double.parseDouble(xxxxx) + 2;
        System.out.println(yyyyy);
    }


    //A-02-14-Math Class
    public static void a2_014_theMathClass() {
        int result = Math.round(1.1F);
        System.out.println(result);

        int result1 = (int) Math.ceil(1.1F);
        System.out.println(result1);

        int result2 = (int) Math.floor(1.1F); // floor the largest int that is smaller or equal to this number.
        System.out.println(result2);

        int result3 = Math.max(1,2); // largest number of the two
        System.out.println(result3);

        double result4 = Math.random(); //
        System.out.println(result4);

        double result5 = Math.random() * 100 ; // multiply by 100 to get random numbers
        System.out.println(result5);


        double result6 = Math.round(Math.random() * 100);  // round
        System.out.println(result6);

        int result7 = (int) Math.round(Math.random() * 100); // round without a decimal point
        System.out.println(result7);

        int result9 = (int) (Math.random() * 100); // another way
        System.out.println(result9);


    }






}
