package lesson10.lesson10_2;/*
 * Created by BASARAB EUGEN on 20.07.2018
 * Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
 * Интерфейс Инструмент содержит метод play() и клавишу String KEY = "До мажор".
 * Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
 * Создать массив типа Инструмент, содержащий инструменты разного типа.
 * В цикле вызвать метод play() для каждого инструмента,
 * который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
 */

public class MainLesson10_2 {
    public static void main(String[] args) {
        Tool tool[] = new Tool[3];
        tool[0] = (Tool) new Guitar(7);
        tool[1] = (Tool) new Drum(20);
        tool[2] = (Tool) new Trumpet(5);

        for (Tool tools : tool) {
            tools.play();
        }
    }
}
