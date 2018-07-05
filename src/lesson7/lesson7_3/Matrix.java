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

class Matrix {

    private static double[][] additionOfMatrices(double[][] array1, double[][] array2){          //сложение с другой матрицей;
        double[][] sumArray = new double[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return sumArray;
    }

    static double[][] multiplicationByNumber(double[][] array1, int k){      //умножение на число;
        double[][] multArray = new double[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                multArray[i][j] = array1[i][j] * k;
            }
        }
        return multArray;
    }

    static double[][] matrixMultiplication(double[][] array1, double[][] array2){        //умножение матриц
        double[][] Multiplication = new double[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                Multiplication[i][j] = array1[i][j] * array2[i][j];
            }
        }
        return Multiplication;
    }

    static void printOut(double[][] array1, double[][] array2, int k){                    //вывод на печать;
        System.out.println("Первый масив " + Arrays.deepToString(array1));
        System.out.println("Второй масив " + Arrays.deepToString(array2));
        System.out.println("сложение масивов " + Arrays.deepToString(additionOfMatrices(array1, array2)));
        System.out.println("умножение на " + k + " " + Arrays.deepToString(multiplicationByNumber(array1, k)));
        System.out.println("умножение масивов " + Arrays.deepToString(matrixMultiplication(array1, array2)));
    }


}
