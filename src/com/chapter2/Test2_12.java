package com.chapter2;

import java.util.Scanner;

public class Test2_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double runwayLength = Math.pow(speed,2) / (2 * acceleration);

        System.out.print("The minimum runway length for this airplane is " + runwayLength);
    }
}
