/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution12 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        float princ, rate, years;

        System.out.println("Enter the principal:");
        princ = input.nextFloat();

        System.out.println("Enter the rate of interest:");
        rate = input.nextFloat();

        System.out.println("Enter the number of years:");
        years = input.nextFloat();

        float answer;
        answer = princ * (1 + (rate/100) * years);

        double roundOff = Math.round(answer*100.0)/100.0;

        System.out.println("After " + years + "% at " + rate + " the investment will be worth $" + roundOff);

    }
}
