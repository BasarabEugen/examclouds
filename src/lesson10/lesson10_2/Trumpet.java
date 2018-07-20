package lesson10.lesson10_2;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

public class Trumpet implements Tool {
    double diameterTrumpet;

    public Trumpet(double diameterTrumpet) {
        this.diameterTrumpet = diameterTrumpet;
    }

    public void play() {
        System.out.println("Plays the trumpet with " + diameterTrumpet + " of diameter");
    }
}
