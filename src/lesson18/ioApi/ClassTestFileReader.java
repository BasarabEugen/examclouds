package lesson18.ioApi;

import java.io.FileReader;
import java.io.IOException;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassTestFileReader {
  public static void main(String[] args) {
    try (FileReader reader = new FileReader("src/io/newfolder/newfile1.txt")){
      int symbol;

      while ((symbol = reader.read()) != -1){
      System.out.print((char) symbol);
      }
    } catch (IOException e){
      System.out.println("Reader Error");
    }
  }
}
