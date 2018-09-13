package lesson18.ioApi;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassTestStreamByte {
  public static void main(String[] args) {
    String text = new String("Hello world");
    byte[] bytes = text.getBytes();
     try(FileOutputStream stream = new FileOutputStream("src/io/classteststreambyte.txt")) {
      for (byte eachByte: bytes){
        stream.write(eachByte);
      }
     } catch (IOException e){
       System.out.println("I/O error");
     }



  }
}
