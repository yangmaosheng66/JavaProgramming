package com.chapter3;

import java.util.Scanner;

public class Test3_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers in int: ");
        int array[] = new int[3];
        array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();

        for(int m = 0;m < 3;m++){
            for(int n = m + 1;n < 3;n++){
                if(array[m] > array[n]){
                    int temp;
                    temp = array[m];
                    array[m] = array[n];
                    array[n] = temp;
                }
            }
        }

        System.out.println("Arrange the numbers in non-descending order: "
                + array[0] + " " + array[1] + " " + array[2]);

    }
}
