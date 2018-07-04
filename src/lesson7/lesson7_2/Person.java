package lesson7.lesson7_2;/*
 * Created by BASARAB EUGEN on 29.06.2018
 * Создать класс Person, который содержит:
a) поля fullName, age.
б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
в) Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */

public class Person {
    public static void main(String[] args) {
        move();
        talk();
    }

    static void move() {
        System.out.println("Такой-то  Person говорит");

    }

    static void talk(){
        System.out.println("Такой-то  Person говорит");
    }

    String fullName;
    int age;
    Person(String fullName, int age){
    }

    Person(){
    }
    Person p1 = new Person(fullName, age);
    Person p2 = new Person();

}
