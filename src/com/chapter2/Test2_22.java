package com.chapter2;

import java.util.Scanner;

public class Test2_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of dollars in int: ");
        int dollars = input.nextInt();

        int dollar = dollars / 100;
        int penny = dollars % 100;

        System.out.print("$" + dollars + " consists of " + dollar + " dollars and " + penny + " pennies");
    }
}
