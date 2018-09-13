package lesson18.ioApi;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class СlassTestMap {
  public static void main(String[] args) {
    String path = "src/io/backup";
    File directory = new File(path);
    if (!directory.exists()){
      System.out.println(directory.mkdirs()? "Successfully" : "Failed");
    } else {
      System.out.println("Already exist");
    }

    if (directory.isDirectory()){
      String[] content = directory.list();
      if (content != null){
        for (String eachFile : content){
          File file = new File(path + "/" + eachFile);
          System.out.println(file.isDirectory() ? (eachFile + " is directory") : (eachFile + " is file"));
        }
      }

    }


  }
}
