package lesson7.lesson7_1;/*
 * Created by basar on 29.06.2018
 * Класс Phone. (Задание с урока)
a) Создайте класс Phone, который содержит переменные number, model и weight.
б) Создайте три экземпляра этого класса.
в) Выведите на консоль значения их переменных.
г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
ж) Добавить конструктор без параметров.
з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
Вызвать этот метод.
к) Создать метод sendMessage  с аргументами переменной длины.
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
Метод выводит на консоль номера этих телефонов.
 */

public class Lesson7_1 {
    public static void main(String[] args) {

        Phone myPhone1 = new Phone();
        Phone myPhone2 = new Phone();
        Phone myPhone3 = new Phone();

        System.out.println(myPhone1.model);
        System.out.println(myPhone1.number);
        System.out.println(myPhone1.weight);

        myPhone1.receiveCall("Vasea");
        myPhone2.receiveCall("Oleg");
        myPhone3.receiveCall("Andrei");
        myPhone1.receiveCall("Jora", "9186552147");

        myPhone1.getNumber();
        myPhone2.getNumber();
        myPhone3.getNumber();

        myPhone1.sendMessage("152454751", "15458154547", "5145415415");
    }
}
