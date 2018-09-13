package lesson18.nioApi;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * basar
 * 13.09.2018
 * examclouds
 */
public class ClassWriteStream {
  public static void main(String[] args) {

    String text = "Hello World";
    byte[] bytes = text.getBytes();

    try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get("file.txt")))){
      for (byte eachByte: bytes) {
        outputStream.write(eachByte);
      }
    } catch (IOException e){
      System.out.println("I/O error");
    }
  }
}
