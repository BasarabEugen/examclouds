/**
 * Создать очередь, содержащую объекты класса HeavyBox.
 * Используем класс ArrayDeque. Поместить объекты в очередь с помощью метода offer().
 * Удалить объекты методом poll().
 */

package lesson16.lesson16_2;


import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;


/**
 * basar
 * 27.08.2018
 * examclouds
 */
public class Lesson16_2 {
    public static void main(String[] args) {
        Deque<MyBox> stack = new ArrayDeque<>();

        stack.offer(new MyBox("Box1",150));
        stack.offer(new MyBox("Box2",160));
        stack.offer(new MyBox("Box3",170));
        stack.offer(new MyBox("Box4",180));
        stack.offer(new MyBox("Box5",190));

        stack.forEach(s -> System.out.println("Weight of  " + s.name + " = " + s.weight));

        stack.poll();
        System.out.println("Poll box");


        stack.forEach(s -> System.out.println("Weight of  " + s.name + " = " + s.weight));

    }

}


class MyBox {
    String name;
    int weight;

    MyBox(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
