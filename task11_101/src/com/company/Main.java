package com.company;

import java.util.Scanner;
import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
        int i, num, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();
        array = new int[num];
        for (i = 0; i<num; i++) {
            array[i] = (int) (Math.random() * 1000+1);
        }
        System.out.println("массив перед пузырьковой сортировкой : "+Arrays.toString(array));
        bubbleSort(array);
        System.out.println("массив после пузырьковой сортировки : "+Arrays.toString(array));
        int k = 0;
        while (i<array.length) {
            if (array[i] == array[i+1]) {
                k++;
            }

        }
        System.out.println("k="+k);
        if (k == 1) {
            System.out.println("Только два одинаковых элемента");
        } else {
            if (k == 0) {
                System.out.println("Нет одинаковых элементов");
            } else {
                System.out.println("Много одинаковых элементов");
            }
        }
    }

    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j<num.length-1; j++) {
                if (num[j]<num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    flag = true;
                }
            }
        }
    }
}