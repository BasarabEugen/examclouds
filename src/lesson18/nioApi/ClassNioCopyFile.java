package lesson18.nioApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * basar
 * 13.09.2018
 * examclouds
 */
public class ClassNioCopyFile {
  public static void main(String[] args) {

    try {
      Path sourcePath = Paths.get("file.txt"), destinationPath = Paths.get("output.txt");
      Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

    } catch (IOException e){
      System.out.println("I/O error");
    }


  }
}
