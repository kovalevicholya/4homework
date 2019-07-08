package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
        switch (number) {
            case 1:
                int[][] nums = {{0, 2, 3}, {4, 5, 6}};
                System.out.println(Arrays.deepToString(nums));
                int k = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 0 && j == 0) {
                            k = nums[0][0];
                            nums[0][0] = nums[1][0];
                            nums[1][0] = k;
                        }
                    }
                }
                System.out.println(Arrays.deepToString(nums));
                break;
            case 2:
                int[][] nums2 = {{0, 2, 3}, {4, 5, 6}};
                System.out.println(Arrays.deepToString(nums2));
                int m = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 0 && j == 2) {
                            m = nums2[0][2];
                            nums2[0][2] = nums2[1][2];
                            nums2[1][2] = m;
                        }
                    }
                }
                System.out.println(Arrays.deepToString(nums2));
                break;
            default:
        }
    }
}
