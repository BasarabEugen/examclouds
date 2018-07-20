package lesson10.lesson10_4;/*
 * Created by BASARAB EUGEN on 20.07.2018
 *  a) Создать перечисление, содержащее размеры одежды (XXS,XS,S,M,L).
 *  Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
 *  Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
 *  Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40 ), соответствующее каждому размеру.
 *  Создать конструктор, принимающий на вход euroSize.
 *  б) Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
 *  в) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
 *  г) Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
 *  Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
 *  Галстук (реализует интерфейсы "Мужская Одежда").
 *  д) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
 *  одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
 *  Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
 */

import lesson10.lesson10_4.interfaces.MenClothing;

public class MainLesson10_4 {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(ClothesSize.XXS, 4, "Blue");
        Pants pants = new Pants(ClothesSize.XL, 12, "Red");
        Skirt skirt = new Skirt(ClothesSize.XL, 5, "Black");
        Tie tie = new Tie(ClothesSize.XL, 2, "Green");
        Clothing[] clothingType = new Clothing[4];
        clothingType[0] = tshirt;
        clothingType[1] = pants;
        clothingType[2] = skirt;
        clothingType[3] = tie;

        for (Clothing clothing : clothingType) {
            System.out.println(clothing);
        }
        tshirt.toDressMan();
        tshirt.toDressWomen();
        pants.toDressMan();
        pants.toDressWomen();
        skirt.toDressWomen();
        tie.toDressMan();


    }
}
