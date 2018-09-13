package lesson18.nioApi;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * basar
 * 13.09.2018
 * examclouds
 */
public class ClassReadChanelV2 {
  public static void main(String[] args) {

    try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("file.txt"))) {
      MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());

      for (int i = 0; i < channel.size(); i++) {
        System.out.print((char) buffer.get());
      }
    } catch (IOException e) {
      System.out.println("I/O error");
    }
  }
}
