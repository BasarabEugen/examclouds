package lesson10.lesson10_3;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

public enum Season {
    WINTER(-15), SPRING(10), SUMMER(35) {
        public String getDescription() {
            return " the season is hot ";
        }
    }, AUTUMN(15);
    private double temp;

    Season(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public String getDescription() {
        return " the season is coold ";
    }
}
