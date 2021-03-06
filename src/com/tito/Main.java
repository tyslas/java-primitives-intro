package com.tito;

public class Main {

    public static void main(String[] args) {
        //BYTE, SHORT, INT & LONG
        // int has a width of 32 - max size = 2^31
        int myMinValue = -2_147_483_648; //use _ to make numbers easier to read!
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue / 2);

        // byte has a width of 8 (2^7)
        byte myByteMin = -128; //bytes are more efficient than ints
        byte myByteMax = 127; //takes up way less space than an int
        byte myNewByteValue = (byte) (myByteMin / 2);
//        System.out.println("\n" + "myNewByteValue: " + myNewByteValue + "\n");

        // short has a width of 16 (2^15)
        short myShortMin = -32768;
        short myShortMax = 32767;
        short myNewShortValue = (short) (myShortMin / 2);
//        System.out.println("myNewShortValue: " + myNewShortValue + "\n");

        // long has a width of 64 - max size = 2^63
        long myLongMin = -9_223_372_036_854_775_808L;
        long myLongMax = 9_223_372_036_854_775_807L;

        // Challenge
        // 1. Create a byte variable and set it to any valid byte number
        // 2. Create a short variable and set it to any valid short number
        // 3. Create an int variable and set to any valid int number
        // 4. Create a variable of type long, and make it equal to
        // 50_000 + 10 times the sum of the byte + the short + plus to the int

        byte newByte = 64;
        short newShort = -24_000;
        int newInt = 83_555;
        long newLong = 50_000L;
        long total = (newLong + (10 * newByte) + newShort + newInt);
        System.out.println("total = newLong + (10 * newByte) + newShort + newInt: " + total + "\n");

        //FLOAT & DOUBLE
        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f; // 7 decimal digits
        // width of a double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d; // 16 decimal digits
        //if double or float aren't specified then double is assumed by the compiler

//        System.out.println("myIntValue: " + myIntValue + "\n");
//        System.out.println("myFloatValue: " + myFloatValue + "\n");
//        System.out.println("myDoubleValue: " + myDoubleValue + "\n");

        // Challenge: Convert a given number of lbs -> kg (1 lb is equal to 0.45359237 kg)
        // 1. Create a variable to store the number of lbs
        int numLb = 165;
        // 2. Calculate the number of kg for the result of (1.) and store in a variable
        double numKg = (numLb * 0.45359237d);
        // 3. Print out the result
//        System.out.println("numLb: " + numLb + "lb");
//        System.out.println("numKg: " + numKg + "kg");
        double pi = 3.141_5927d;

        //CHAR & BOOLEAN
        // width of 16 (2 bytes)
        char myChar = '\u03A8'; // Ψ can only be a single character and can use uni-code
//        System.out.println("unicode output 1: " + myChar);

        boolean myBoolean = true;
        //CHALLENGE: print the 'registered' symbol to the screen
        // 1. find the code for the registered symbol on the same line as the copyright symbol
        // 2. create a variable of type char and assign it the unicode value for that symbol
        // 3. print the variable to the screen
        char newChar = '\u00AE'; // ®
//        System.out.println("unicode output 2: " + newChar);

        //STRING type -> not a primitive type, but used very frequently
        String myString = "this is a string";
        System.out.println("myString: " + myString);
        myString = myString + ", and this is another piece";
        System.out.println("myString: " + myString);

        String numString = "250.55";
        numString = numString + "49.95";
        System.out.println("the result is: " + numString);

        String lastString = "10";
        int stringInt = 50;
        lastString += stringInt;
        // the int type is promoted to a String type
        System.out.println("int + string: " + lastString);
    }
}
