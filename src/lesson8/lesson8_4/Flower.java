package lesson8.lesson8_4;/*
 * Created by BASARAB EUGEN on 10.07.2018
 */

public class Flower {
    private String producingCountry;
    private int shelfLife;
    private double price;
    private static int count;

    public Flower(String producingCountry, int shelfLife, double price) {
        this.producingCountry = producingCountry;
        this.shelfLife = shelfLife;
        this.price = price;
        count++;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double cost(Flower... flowers){
        double result = 0;
        for (Flower f : flowers){
            result = result + f.getPrice();
        }
        return result;

    }
}
