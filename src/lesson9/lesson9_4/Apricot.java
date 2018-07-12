package lesson9.lesson9_4;/*
 * Created by BASARAB EUGEN on 12.07.2018
 */

class Apricot extends Fruit {
    private double costApricot, weight;

    Apricot(double costApricot, double weight) {
        this.costApricot = costApricot;
        this.weight = weight;
    }

    @Override
    public void costTheFruit() {
        double a = costApricot * weight;
        System.out.println("Total cost apricot : " + a);
    }

    public double getCostApricot() {
        return costApricot;
    }

    public double getWeight() {
        return weight;
    }
}
