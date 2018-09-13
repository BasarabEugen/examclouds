package lesson18.ioApi;

import java.io.*;

/**
 * basar
 * 12.09.2018
 * examclouds
 */
public class ClassSerialization {
  private static final String PATH = "src/io/object.txt";

  public static void main(String[] args) throws ClassNotFoundException {
    serialize();
    deserialize();

  }

  private static void serialize() {
    SerializableClass serializableClass = new SerializableClass(SerializableClass.class.getName(), 0);

    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
      outputStream.writeObject(serializableClass);
    } catch (IOException e) {
      System.out.println("Output error");
    }
  }

  private static void deserialize() throws ClassNotFoundException{
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH))){
      SerializableClass serializableClass = (SerializableClass) inputStream.readObject();
      System.out.printf("Title: %s%nSize: %d", serializableClass.title, serializableClass.size, 0);
    }catch (IOException e){
      System.out.println("Input error");
    }
  }



  private static class SerializableClass implements Serializable {
    private String title;
    private int size;

    public SerializableClass(String title, int size) {
      this.title = title;
      this.size = size;
    }
  }
}
