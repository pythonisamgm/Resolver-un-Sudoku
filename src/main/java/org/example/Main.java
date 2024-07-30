package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void printMatrix(int matrix[][]) {
        for (int i=0; i<matrix.length;i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    int[][] matrix = {{0,2,3,4},
                {2,0,4,0},
                {3,0,1,0},
                {4,3,0,1}};

        printMatrix(matrix);

        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[2][0]);
        System.out.println(matrix[3][0]);
        }

    }