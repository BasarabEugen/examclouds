package lesson16.lesson16_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * basar
 * 28.08.2018
 * examclouds
 */
public class Lesson16_3 {
    public static void main(String[] args) {
        List<MyBox> myBoxList = new ArrayList<>();
                 myBoxList.add(new MyBox("Box1", 250));
                 myBoxList.add(new MyBox("Box2", 290));
                 myBoxList.add(new MyBox("Box3", 310));
                 myBoxList.add(new MyBox("Box4", 370));
                 myBoxList.add(new MyBox("Box5", 270));

        System.out.println("All boxes");
        myBoxList.forEach(s -> System.out.println("Weight of  " + s.name + " = " + s.weight));

        System.out.println("Big boxes");
        List<MyBox> result = getBigBoxes(myBoxList);
        myBoxList.forEach(s -> System.out.println("Weight of  " + s.name + " = " + s.weight));

        System.out.println("Small boxes");
        List<MyBox> result2 = getSmallBoxes(myBoxList);
        myBoxList.forEach(s -> System.out.println("Weight of  " + s.name + " = " + s.weight));
    }

    private static List<MyBox> getBigBoxes(List<MyBox> myBoxList) {
        List<MyBox> result = new ArrayList<>();
        Iterator<MyBox> iterator = myBoxList.iterator();
        while (iterator.hasNext()) {
            MyBox box = iterator.next();
            if (box.getWeight() < 300) {
                result.add(box);
                iterator.remove();
            }
        }
        return result;
    }

    private static List<MyBox> getSmallBoxes(List<MyBox> myBoxList) {
        List<MyBox> result2 = new ArrayList<>();
        Iterator<MyBox> iterator = myBoxList.iterator();
        while (iterator.hasNext()) {
            MyBox box = iterator.next();
            if (box.getWeight() > 300) {
                result2.add(box);
                iterator.remove();
            }
        }
        return result2;
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