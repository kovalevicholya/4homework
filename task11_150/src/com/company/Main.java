package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n<20: ");
        int n = in.nextInt();
        int[] nums = new int[20];
        for (int i = 0; i < 20; i++) {
            nums[i] = (int) (Math.random() * 15);
            System.out.println(nums[i]);
        }
        for (int i = 0; i < 20; i++) {
            if (i != n) {
                System.out.println("   " + nums[i]);
            }
        }
    }
}
