package lesson14.lesson14_4;/*
 * Created by BASARAB EUGEN on 02.08.2018
 */

public class Lesson14_4 {
    public static void main(String[] args) {
        Printables printables = new Printables(){
            @Override
            public void print(){
                System.out.println("Something");
            }
        };
        printables.print();
    }
}
