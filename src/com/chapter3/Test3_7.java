package com.chapter3;

import java.util.Scanner;

public class Test3_7 {
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
        if(numberOfOneDollars != 0)
            System.out.println("    " + numberOfOneDollars + (numberOfOneDollars == 1 ? " dollar" : " dollars"));
        if(numberOfOneQuarters != 0)
            System.out.println("    " + numberOfOneQuarters + (numberOfOneQuarters == 1 ? " quarter" : " quarters"));
        if(numberOfOneDimes != 0)
            System.out.println("    " + numberOfOneDimes + (numberOfOneDimes == 1 ? " dime" : " dimes"));
        if(numberOfOneNickels != 0)
            System.out.println("    " + numberOfOneNickels + (numberOfOneNickels == 1 ? " nickel" : " nickels"));
        if(numberOfOnePennies != 0)
            System.out.println("    " + numberOfOnePennies + (numberOfOnePennies == 1 ? " penny" : " pennies"));
    }
}
