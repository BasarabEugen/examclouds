package lesson18.ioApi;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassTestStreamM {
  public static void main(String[] args) {
    String text = new String("Some Text Again");
    byte[] buffer = text.getBytes();

    try(FileOutputStream stream = new FileOutputStream("src/io/NewFiles1.txt")){
      for (byte eachBufferElement: buffer) {
        stream.write(eachBufferElement);
      }
    }
    catch (IOException e){
      System.out.println("I/O error");
    }
  }
}
