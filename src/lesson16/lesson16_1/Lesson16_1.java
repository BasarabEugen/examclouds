package lesson16.lesson16_1;

import java.util.ArrayList;
import java.util.List;

/**
 * basar
 * 27.08.2018
 * examclouds
 */
public class Lesson16_1 {
    public static void main(String[] args) {
        List<MyBox> box = new ArrayList<>();
        box.add(new MyBox(50));
        box.add(new MyBox(100));
        box.add(new MyBox(150));

        MyBox myBox1 = box.get(0);
        myBox1.weight += 1;
        MyBox myBox2 = box.get(box.size() - 1);
        myBox2.weight -= 1;
        int x = box.size();

        System.out.println("Count of elements " + box.size());
        for (MyBox b : box) {
            System.out.println("Weight of boxes: " + b.weight);
        }

        for (int i = 0; i < x; ++i) {
            MyBox myBox3 = box.get(box.size() - 1);
            box.remove(myBox3);
            if (box.size() > 0) {
                System.out.println("Count of elements " + box.size());
                box.forEach(s -> System.out.println("Weight of boxes: " + s.weight));
            } else {
                System.out.println("OutOfBounds");
            }
        }
    }
}

class MyBox {
    int weight;

    public MyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}