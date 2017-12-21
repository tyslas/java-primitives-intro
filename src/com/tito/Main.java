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
        System.out.println("\n" + "myNewByteValue: " + myNewByteValue + "\n");

        // short has a width of 16 (2^15)
        short myShortMin = -32768;
        short myShortMax = 32767;
        short myNewShortValue = (short) (myShortMin / 2);
        System.out.println("myNewShortValue: " + myNewShortValue + "\n");

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
        
    }
}
