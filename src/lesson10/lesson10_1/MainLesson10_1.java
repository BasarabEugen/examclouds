package lesson10.lesson10_1;/*
 *  Created by BASARAB EUGEN on 19.07.2018
 *  а) Определить интерфейс Printable, содержащий метод void print().
 *  б) Определить класс Book, реализующий интерфейс Printable.
 *  в) Определить класс Magazine, реализующий интерфейс Printable.
 *  г) Создать массив типа Printable, который будет содержать книги и журналы.
 *  д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 *  е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
 *  который выводит на консоль названия только журналов.  Создать статический метод printBooks(Printable[] printable)в классе Book,
 *  который выводит на консоль названия только книг. Используем оператор instanceof.
 */

import static lesson10.lesson10_1.Book.printBook;
import static lesson10.lesson10_1.Magazine.printMagazine;

public class MainLesson10_1 {
    public static void main(String[] args) {

        Printable[] printables = new Printable[6];
        printables[0] = new Book("ABCdar", 150);
        printables[1] = new Book("Kamasutra", 10);
        printables[2] = new Book("Java for beginers", 500);
        printables[3] = new Magazine("VOGE", 5000);
        printables[4] = new Magazine("PLAY BOY", 10000);
        printables[5] = new Magazine("SLAVEANKA", 1000);

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }

//        for(Printable printable: printables){
//            printable.print();
//        }

        printMagazine(printables);
        printBook(printables);
    }
}
