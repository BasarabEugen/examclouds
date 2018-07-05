package lesson7.lesson7_4;/*
 * Created by BASARAB EUGEN on 05.07.2018
 */

public class Main {
    static Book myBook1 = new Book("Приключения", "Эдик");
    static Book myBook2 = new Book("Словарь", "Олег");
    private static Book myBook3 = new Book("Энциклопедия", "Касатка");

    String FullName;
    int numberOfReadersTicket;
    String Faculty;
    String DateofBirth;
    String Telephone;

    public static void main(String[] args) {
        Reader.takeBook(3);
        Reader.takeBook("Приключения", "Словарь", "Энциклопедия");
        Reader.takeBook(myBook1, myBook2, myBook3);
        Reader.returnBook(3);
        Reader.returnBook("Приключения", "Словарь", "Энциклопедия");





    }
}
