package lesson11.lesson11_1;/*
 * Created by BASARAB EUGEN on 28.07.2018
 *  а) Создайте объекты класса Double, используя методы valueOf().
 *  б) Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
 *  в) Преобразовать объект класса Double ко всем примитивным типам.
 *  г) Вывести значение объекта Double на консоль.
 *  д) Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
 */

public class Lesson11_1 {
    public static void main(String[] args) {

        Double doubl = 3.14;

        Double d1 = Double.valueOf("3.14");
        Double d2 = Double.parseDouble("3.14");
        byte doublByte = doubl.byteValue();
        short doublShort = doubl.shortValue();
        int doublInt = doubl.intValue();
        long doublLong = doubl.longValue();
        float doublFloat = doubl.floatValue();
        String d = Double.toString(3.14);

        System.out.println("doubl = " + doubl);
        System.out.println("toString: " + d);
        System.out.println("valueOf " + d1);
        System.out.println("parseDouble " + d2);
        System.out.println("byte :" + doublByte);
        System.out.println("short :" + doublShort);
        System.out.println("int :" + doublInt);
        System.out.println("long :" + doublLong);
        System.out.println("float :" + doublFloat);


    }


}
