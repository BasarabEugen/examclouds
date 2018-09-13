package lesson14.lesson14_10;

import java.util.function.Consumer;

public class Lesson14_10 {
    public static void main(String[] args) {

        Consumer<HeavyBox> consumer = heavyBox -> {
            System.out.println("Отгрузил ящик с весом " + heavyBox.weight + " кг.");
        };

        consumer.accept(new HeavyBox(150));
    }
}

class HeavyBox {
    public int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }
}
