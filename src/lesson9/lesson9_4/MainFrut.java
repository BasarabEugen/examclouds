package lesson9.lesson9_4;/*
 * Created by BASARAB EUGEN on 12.07.2018
 * Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его. Класс Фрукт содержит:
 *  a) переменную вес,
 *  б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
 *  в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта.
 *  Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов. А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */

public class MainFrut {
    public static void main(String[] args) {
        Apple apple1 = new Apple(50, 5);
        Pear pear1 = new Pear(70, 2);
        Apricot apricot1 = new Apricot(110, 1);

        apple1.costTheFruit();
        pear1.costTheFruit();
        apricot1.costTheFruit();

        System.out.println();


    }
}
