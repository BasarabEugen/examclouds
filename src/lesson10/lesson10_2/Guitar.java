package lesson10.lesson10_2;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

public class Guitar implements Tool {
    int numberCords;

    public Guitar(int numberCords) {
        this.numberCords = numberCords;
    }

    public void play() {
        System.out.println("Plays the guitar with " + numberCords + " of cords");
    }
}
