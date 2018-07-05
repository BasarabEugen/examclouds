package lesson7.lesson7_3;/*
 * Created by BASARAB EUGEN on 05.07.2018
 */

public class MainMatrix {
    public static void main(String[] args) {
        int k = 2;
        int row = 5;
        int colums = 5;
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
        Matrix.printOut(array1, array2, k);
    }
}
