package lesson18.nioApi;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassWriteChanelV2 {
  public static void main(String[] args) {

    try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("file.txt"),
        StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {
      MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 58);

      for (int i = 0; i < buffer.capacity(); i++) {
        buffer.put((byte) (('A' + i)));
      }
    }catch (IOException e){
      System.out.println("I/O error");
    }
  }
}
