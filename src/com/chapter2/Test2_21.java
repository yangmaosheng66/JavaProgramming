package com.chapter2;

import java.util.Scanner;

public class Test2_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double futureInvestmentAmount = investmentAmount * Math.pow(1 + annualInterestRate / 100 / 12,years * 12);

        System.out.print("Accumulated value is $" + futureInvestmentAmount);
    }
}
