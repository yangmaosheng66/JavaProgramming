package com.chapter2;

import java.util.Scanner;

public class Test2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double second = 365 * 24 * 60 * 60;
        double born = second / 7;
        double death = second / 13;
        double immigrant = second / 45;
        double population = 312032486;
        for (int i = 0; i < years; i++) {
            population = (int)(population + born - death + immigrant);
        }

        System.out.print("The population in " + years + " years is " + population);
    }
}
