package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: \n");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: \n");
        b = in.nextInt();

        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        int row = 0;
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] * 3 + " ");
            }
    }
}


