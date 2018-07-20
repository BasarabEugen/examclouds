package lesson10.lesson10_3;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

public class MainLesson10_3 {
    public static void main(String[] args) {
        Season myFavoSeason = Season.SUMMER;
        printAllSeasons();
        printSeason(myFavoSeason);
//        printSeason("WINTER");
    }

    private static void printSeason(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("I love summer");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
            default:
                System.out.println("I d'not love seasons");
        }
    }

    private static void printAllSeasons() {
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s + " average temperature is " + s.getTemp() + s.getDescription());
        }
    }

    private static void printSeason(String str) {
        Season somSeason = Season.valueOf(str);
        System.out.println(somSeason);
    }
}
