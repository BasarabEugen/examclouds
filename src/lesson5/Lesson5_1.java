package lesson5;/*
 * Created by basar on 25.06.2018
 * Передать на вход программы число в качестве аргумента. Если оно нечетное, распечатать его. Используем оператор if.
 * Используйте метод Integer.parseInt() для преобразования из String в int.
 */

//import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

public class Lesson5_1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 != 0){
            System.out.println("In the argument is not an even number "+ n);
        } else {
            System.out.println("In the argument an even number " + n);
        }



    }
}
