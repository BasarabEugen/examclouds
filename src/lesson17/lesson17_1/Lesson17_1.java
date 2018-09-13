package lesson17.lesson17_1;

import java.net.PasswordAuthentication;

/**
 * Basarab Eugen
 * 29.08.2018
 * examclouds
 */
public class Lesson17_1 {

  public static void main(String[] args) {
    try {
      authorization("vasea", "qwerty", "qwerty");
    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println(e.getMessage());
    }


  }

  public static boolean authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

      if (login.length() > 20) {
        throw new WrongLoginException("Login " + login + " is wrong");
      }
      if (password.length() > 20 || !password.equals(confirmPassword)) {
        throw new WrongPasswordException("Password " + password + " is wrong");
      }

    return true;
  }
}
