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
            array[i] = (int) (Math.random() * 2);
        }
        System.out.println("массив "+Arrays.toString(array));
        int count = 0;
        for (i = 0; i<num; i++) {
            count = 0;
            int numb = array[i];
            for (int j = 0; j<num; j++) {
                if (numb == array[j]) {
                    count++;
                }
            }
            if (count == 2) {
                break;
            }
        }
        System.out.println("count="+count);
        if (count == 2) {
            System.out.println("Только два одинаковых элемента");
        } else {
            if (count == 1) {
                System.out.println("Нет одинаковых элементов");
            } else {
                System.out.println("Много одинаковых элементов");
            }
        }
    }
}