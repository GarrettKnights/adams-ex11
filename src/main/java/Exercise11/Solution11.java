/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise11;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {

        //Initializes scanner
        Scanner ScanWord = new Scanner(System.in);

        //Declares ints we will be using
        double euros;
        double rate;

        //Asks user for input
        System.out.print("How many euros are you exchanging? ");
        //Scans euros input
        euros = ScanWord.nextDouble();
        //Asks user for input
        System.out.print("What is the exchange rate? ");
        //Scans rate input
        rate = ScanWord.nextDouble();

        //Calculates USD Value
        double USD = euros * rate;

        //Rounds USD Value to 2 decimal places
        double USDround = Math.ceil(USD * 100.0)/100.0;

        //Final print statement
        System.out.print("" + euros + " euros at an exchange rate of " + rate + " is " + USDround);
    }
}
