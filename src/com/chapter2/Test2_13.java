package com.chapter2;

import java.util.Scanner;

public class Test2_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();
        System.out.print("Enter the number of months to come you need: ");
        int months = input.nextInt();

        double totalAmount = 0;

        for(int i = 0;i < months;i++){
            totalAmount = (totalAmount + monthlySavingAmount) * (1 + 0.05 / 12);
        }

        System.out.print("After " + months + " months, the account value is $" + totalAmount);
    }
}
