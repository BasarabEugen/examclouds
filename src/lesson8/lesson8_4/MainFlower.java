package lesson8.lesson8_4;/*
 * Created by BASARAB EUGEN on 10.07.2018
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа. Также подсчитать количество проданных цветов (используем статическую переменную).
 */

import java.util.Arrays;

import static lesson8.lesson8_4.Flower.cost;


public class MainFlower {

    public static void main(String[] args) {

        Roses rose = new Roses("Russia", 20, 150);
        Tulips tulips = new Tulips("Holland", 10, 50);
        Сarnation carnation = new Сarnation("Ukraine", 15, 100);

        Flower[] bouqet1 = {rose, tulips, carnation};

        System.out.println("The price of bouqet1 = " + cost(bouqet1));
    }





}
