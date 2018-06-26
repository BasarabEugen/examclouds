package lesson5;/*
 * Created by basar on 25.06.2018
 * Создать массив типа String размером 3х6. И записать в него значения:
a1  a2  a3  a4  a5  a6
b1  b2  b3  b4  b5  b6
c1  c2  c3  c4  c5  c6
И распечатать.
 */

public class Lesson5_12 {
    public static void main(String[] args) {
        // Initialize array for support with letters.
        String[] letters = {"a", "b", "c"};
        // Initialize matrix of strings 3x6.
        String[][] arr = new String[3][6];

        // Iterate through the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                // Fill matrix cells
                arr[i][j] =  letters[i] + Integer.toString(j+1);
                // Print matrix with values
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}


