package lesson18.ioApi;

import java.io.FileWriter;
import java.io.IOException;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassTestFileWriter {
  public static void main(String[] args) {
    String text = new String("Test By Text");
    char[] chars = new char[text.length()];
    text.getChars(0, text.length(), chars, 0);

    try (FileWriter writer = new FileWriter("src/io/newfolder/newfile1.txt")) {
      for (char eachChar : chars) {
        writer.write(eachChar);
      }
    } catch (IOException e){
      System.out.println("Input Eror");
    }
  }
}
