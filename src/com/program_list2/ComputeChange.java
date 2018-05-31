package com.program_list2;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount int double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;//一个数除以10的n次方的余数是这个数的小数部分从右到左的前n位，11.56%100=56(0.11);11.56%10=6(1.15)

        int numberOfOneQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfOneDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfOneNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfOnePennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfOneQuarters + " quarters");
        System.out.println("    " + numberOfOneDimes + " dimes");
        System.out.println("    " + numberOfOneNickels + " nickels");
        System.out.println("    " + numberOfOnePennies + " pennies");
    }
}
