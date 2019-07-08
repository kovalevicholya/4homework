package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
        switch (number) {
            case 1:
                int[] nums = new int[30];
                for (int i = 0; i < 30; i++) {
                    nums[i] = (int) (Math.random() * 10 + 1);
                    System.out.println(nums[i]);
                }
                int sum1 = 0;
                for (int i = 0; i < 15; i++) {
                    sum1 = sum1 + nums[i];
                    System.out.println(sum1);
                }
                int sum2 = 0;
                for (int i = 15; i < 30; i++) {
                    sum2 = sum2 + nums[i];
                    System.out.println(sum2);
                }
                if (sum1 > sum2) {
                    System.out.println("In the first part");
                } else {
                    System.out.println("In the second part");
                }
            case 2:
                int[] nums2 = new int[30];
                for (int i = 0; i < 30; i++) {
                    nums2[i] = (int) (Math.random() * 10 + 1);
                    System.out.println(nums2[i]);
                }
                int sum_1 = 0;
                for (int i = 0; i < 10; i++) {
                    sum_1 = sum_1 + nums2[i];
                    System.out.println(sum_1);
                }
                int sum_2 = 0;
                for (int i = 10; i < 20; i++) {
                    sum_2 = sum_2 + nums2[i];
                    System.out.println(sum_2);
                }
                int sum_3 = 0;
                for (int i = 20; i < 30; i++) {
                    sum_3 = sum_3 + nums2[i];
                    System.out.println(sum_3);
                }
                if (sum_1 > sum_2 && sum_1 > sum_3) {
                    System.out.println("In the first decade");
                } else {
                    if (sum_2 > sum_1 && sum_2 > sum_3) {
                        System.out.println("In the second decade");
                    } else {
                        System.out.println("In the third decade");
                    }
                }
                in.close();
        }
    }
}
