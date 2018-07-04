package lesson7.lesson7_3;/*
 * Created by BASARAB EUGEN on 29.06.2018
 * Создать класс "Матрица". Класс должен иметь следующие поля:
1) двумерный массив вещественных чисел;
2) количество строк и столбцов в матрице.

Класс должен иметь следующие методы:
1) сложение с другой матрицей;
2) умножение на число;
3) вывод на печать;
4) умножение матриц.
 */

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int k = 2;
        int raw;
        int colums;
        double[][] array1 = {
                {2.5, 4.8, 2.8, 7.5, 5.5},
                {5.5, 4.2, 9.1, 0.1, 3.3},
                {9.5, 0.8, 1.0, 9.1, 2.9},
                {3.5, 4.9, 0.8, 2.2, 6.6},
                {1.5, 1.8, 2.3, 0.9, 9.3}
        };
        double[][] array2 = {
                {1.5, 3.8, 5.8, 0.5, 1.5},
                {2.5, 0.2, 0.1, 0.1, 3.3},
                {0.5, 0.8, 1.0, 9.1, 2.9},
                {1.5, 4.9, 0.8, 2.2, 6.6},
                {0.5, 6.8, 2.3, 1.9, 2.2}
        };
        printOut(array1, array2, k);
    }

    private static double[][] additionOfMatrices(double[][] array1, double[][] array2){          //сложение с другой матрицей;
        double[][] sumArray = new double[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return sumArray;
    }

    private static double[][] multiplicationByNumber(double[][] array1, int k){      //умножение на число;
        double[][] multArray = new double[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                multArray[i][j] = array1[i][j] * k;
            }
        }
        return multArray;
    }

    private static void printOut(double[][] array1, double[][] array2, int k){                    //вывод на печать;
        System.out.println("Первый масив " + Arrays.deepToString(array1));
        System.out.println("Второй масив " + Arrays.deepToString(array2));
        System.out.println("сложение масивов " + Arrays.deepToString(additionOfMatrices(array1, array2)));
        System.out.println("умножение на " + k + " " + Arrays.deepToString(multiplicationByNumber(array1, k)));
        System.out.println("умножение масивов " + Arrays.deepToString(matrixMultiplication(array1, array2)));
    }

    private static double[][] matrixMultiplication(double[][] array1, double[][] array2){        //умножение матриц
        double[][] Multiplication = new double[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                Multiplication[i][j] = array1[i][j] * array2[i][j];
            }
        }
        return Multiplication;
    }
}
