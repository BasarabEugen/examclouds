package lesson9.lesson9_4;/*
 * Created by BASARAB EUGEN on 12.07.2018
 */

class Apple extends Fruit {
    private double costApple, weight;

    Apple(double costApple, double weight) {
        this.costApple = costApple;
        this.weight = weight;
    }

    @Override
    public void costTheFruit() {
        double a = costApple * weight;
        System.out.println("Total cost apple : " + a );
    }
}
