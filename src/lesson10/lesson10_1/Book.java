package lesson10.lesson10_1;/*
 * Created by BASARAB EUGEN on 19.07.2018
 */

public class Book implements Printable {
    private String author;
    private int forSale;

    public static void printBook(Printable[] array) {
        for (Printable printable : array) {
            if (printable instanceof Book) {
                System.out.println(printable);
            }
        }
    }

    Book(String author, int forSale) {
        this.author = author;
        this.forSale = forSale;
    }

    @Override
    public void print() {
        System.out.println("The book " + author + " was solds on the " + forSale + " copies ");
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }
}
