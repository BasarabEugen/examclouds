package lesson9.lesson9_4;/*
 * Created by BASARAB EUGEN on 12.07.2018
 */

class Pear extends Fruit {
    private double costPear, weight;

    Pear(double costPear, double weight) {
        this.costPear = costPear;
        this.weight = weight;
    }

    @Override
    public void costTheFruit() {
        double a = costPear * weight;
        System.out.println("Total cost pear : " + a);
    }

    public double getCostPear() {
        return costPear;
    }

    public double getWeight() {
        return weight;
    }
}
