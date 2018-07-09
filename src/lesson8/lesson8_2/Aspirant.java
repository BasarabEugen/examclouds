package lesson8.lesson8_2;/*
 * Created by BASARAB EUGEN on 09.07.2018
 */

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    public double getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }

    }
}
