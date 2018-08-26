package lesson14.lesson14_5;/*
 * Created by BASARAB EUGEN on 03.08.2018
 */

public class Food {
    Food food = new Food(){
        public void prepare(Cookable c) {
            c.cook();
        }

    };
    public static void main(String[] args) {

    }
}
