package lesson7.lesson7_4;/*
 * Created by basar on 29.06.2018
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон.
 * Методы takeBook(), returnBook().
Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 Аналогичным образом перегрузить метод returnBook().
 Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */

class Reader {



    static void takeBook(int numberOfBooks){

        System.out.println("Петров В. В. взял " + numberOfBooks +" книги");
    }

    static void takeBook(String... books){
        int i = 0;
        System.out.print("Петров В. В. взял книги: ");

        for (String element: books) {
            System.out.print(element);
            i++;
            if (i < books.length ){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }

    static void takeBook(Book... bookObjects){

        int i = 0;
        System.out.print("Петров В. В. взял книги: ");

        for (Book book: bookObjects) {
            System.out.print(book.NameOfBook);
            i++;
            if (i < bookObjects.length){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }

    static void returnBook(int numberOfBooks){
        System.out.println("Петров В. В. вернул " + numberOfBooks +" книги");
    }

    static void returnBook(String... books){
        int i = 0;
        System.out.print("Петров В. В. вернул книги: ");

        for (String element: books) {
            System.out.print(element);
            i++;
            if (i < books.length ){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }
}
