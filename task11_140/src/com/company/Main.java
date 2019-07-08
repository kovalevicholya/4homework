package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input NumberArray: ");
        int numberArray = in.nextInt();
        int[] nums = new int[numberArray];
        for (int i = 0; i < numberArray; i++) {
            nums[i] = (int) (Math.random() * 1000 + 1);
            System.out.println(nums[i]);
        }
        int min1, min2;
        min1 = nums[0];
        min2 = nums[0];
        for (int i = 0; i < numberArray; i++) {
            if (nums[i] < min1) {
                min1 = nums[i];
            } else {
                if (nums[i] < min2) {
                    min2 = nums[i];
                }
            }
        }
        System.out.println("Min1=" + min1 + "Min2=" + min2);
    }
}

