package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
        switch (number) {
            case 1:
                System.out.print("Input NumberArray1: ");
                int numberArray1 = in.nextInt();
                int[] nums1 = new int[numberArray1];
                for (int i = 0; i < numberArray1; i++) {
                    nums1[i] = (int) (Math.random()*15);
                    System.out.println(nums1[i]);
                }
                for (int i = 0; i < numberArray1; i++) {
                    if (nums1[i] % 10 == 0) {
                        nums1[i] = 0;
                        System.out.println("   " + nums1[i]);
                    }
                    else {
                        System.out.println("   " + nums1[i]);
                    }
                }
                break;
            case 2:
                System.out.print("Input NumberArray2: ");
                int numberArray2 = in.nextInt();
                int[] nums2 = new int[numberArray2];
                for (int i = 0; i < numberArray2; i++) {
                    nums2[i] = (int) (Math.random() * 15);
                    System.out.println(nums2[i]);
                }
                for (int i = 0; i < numberArray2; i++) {
                    if (nums2[i] % 2 == 0) {
                        nums2[i] = nums2[i]/2;
                        System.out.println("   " + nums2[i]);
                    }
                    else {
                        nums2[i] = nums2[i]*2;
                        System.out.println("   " + nums2[i]);
                    }
                }
                break;
            case 3:
                int m, n;
                System.out.print("Input NumberArray3: ");
                int numberArray3 = in.nextInt();
                System.out.print("Input m: ");
                m = in.nextInt();
                System.out.print("Input n: ");
                n = in.nextInt();
                int[] nums3 = new int[numberArray3];
                for (int i = 0; i < numberArray3; i++) {
                    nums3[i] = (int) (Math.random() * 15);
                    System.out.println(nums3[i]);
                }
                for (int i = 0; i < numberArray3; i++) {
                    if (nums3[i] % 2 != 0) {
                        nums3[i] = nums3[i]/m;
                        System.out.println("   " + nums3[i]);
                    }
                    else {
                        if (i%2!=0)
                        nums3[i] = nums3[i]*n;
                        System.out.println("   " + nums3[i]);
                    }
                }
                break;
        }
    }
}