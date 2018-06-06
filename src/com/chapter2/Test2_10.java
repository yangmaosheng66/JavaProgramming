package com.chapter2;

import java.util.Scanner;

public class Test2_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double energyNeeded = amountOfWater * (finalTemperature - initialTemperature) * 4184;

        System.out.print("The energy needed is " + energyNeeded);
    }
}
