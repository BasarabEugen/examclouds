package lesson8.lesson8_2;/*
 * Created by BASARAB EUGEN on 09.07.2018
 */

public class Student {
    private String firstName, lastName, group;
    private double averageMark, scholarships;

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    public double getScholarship() {
        if (getAverageMark() == 5) {
            return 100;
        } else {
            return 80;
        }

    }
}
