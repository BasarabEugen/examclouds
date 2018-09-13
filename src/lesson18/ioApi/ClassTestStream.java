package lesson18.ioApi;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassTestStream {
  public static void main(String[] args) {
    String text = "Some text";
    byte[] buffer = text.getBytes();

    FileOutputStream stream = null;

    try {
      stream = new FileOutputStream("src/io/NewFiles.txt");
      for (byte eachBufferElement : buffer) {
        stream.write(eachBufferElement);
      }
    } catch (IOException exeption) {
      System.out.println("Input /Output error");
    } finally {
      try {
        if (stream != null) stream.close();
      } catch (IOException exeption) {
        System.out.println("Error closing");
      }
    }


  }
}
