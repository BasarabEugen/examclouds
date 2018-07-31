package lesson14.lesson14_1;/*
 * Created by BASARAB EUGEN on 31.07.2018
 */

public class MainLesson14_1 {
    public static void main(String[] args) {
        User user = new User("Alex", "mypass");
        User user2 = new User("Andrey", "password");
        user.createQuery();

        User.Query query = user2.new Query();
        query.printToLog();

        User.Query query2 = new User("Vasea", "qwerty").new Query();
        query2.printToLog();
    }
}
