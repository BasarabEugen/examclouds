package lesson18.ioApi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassTestStreamCopy {
  public static void main(String[] args) {
    try(FileInputStream fileInputStream = new FileInputStream("src/io/classteststreambyte.txt")){
      /*Create folder*/
      File directory = new File("src/io/newfolder");
      if (!directory.exists()) directory.mkdirs(); // if directory not exist else create new directory

      try(FileOutputStream fileOutputStream = new FileOutputStream("src/io/newfolder/newfile.txt")){
        byte[] bytes = new byte[fileInputStream.available()];

        int length;

        while ((length = fileInputStream.read(bytes)) != -1){
          fileOutputStream.write(bytes, 0, length);
        }
      }catch (IOException e){
        System.out.println("Output error");
      }

    } catch (IOException e){
      System.out.println("I/O error");
    }


    try(FileInputStream inputStream = new FileInputStream("src/io/newfolder/newfile.txt")) {
      int symbol;
      while ((symbol = inputStream.read()) != -1) {
        System.out.print((char) symbol);
      }
    } catch (IOException e){
      System.out.println("I/O error");
    }

  }
}
