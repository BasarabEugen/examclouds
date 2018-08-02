package lesson14.lesson14_2;/*
 * Created by BASARAB EUGEN on 02.08.2018
 */

import java.util.Objects;

public class User2 {
    private String login;
    private String password;

    private User2(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User2)) return false;
        User2 user2 = (User2) o;
        return Objects.equals(login, user2.login) &&
                Objects.equals(password, user2.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User2{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    void createQuery(){
        class Query{
            private void printToLog(){
                System.out.println(User2.this + " send query");
            }
        }
        Query query = new Query();
        query.printToLog();
    }


}
