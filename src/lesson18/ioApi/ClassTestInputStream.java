package lesson18.ioApi;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassTestInputStream {
  public static void main(String[] args) {

    try (FileInputStream inputStream = new FileInputStream("src/io/classteststreambyte.txt")) {
      int symbol;
      while ((symbol = inputStream.read()) != -1) {
        System.out.print((char) symbol);
      }

    } catch (IOException e) {
      System.out.println("File not exist");
    }
  }
}
