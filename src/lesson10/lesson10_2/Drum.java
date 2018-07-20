package lesson10.lesson10_2;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

public class Drum implements Tool {
    double sizeDrum;

    public Drum(double sizeDrum) {
        this.sizeDrum = sizeDrum;
    }

    public void play() {
        System.out.println("Plays the drum with " + sizeDrum + " of size");
    }
}
