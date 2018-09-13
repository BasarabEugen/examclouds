/**
 * basar
 * 29.08.2018
 * examclouds
 */
package lesson16.lesson16_5;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


  public class Lesson16_5 {

    public static void main(String[] args) {
      Map<String, Toys> tm = new TreeMap<>();

      tm.put("ToyName_1", new Toys("ToyName_1", 50));
      tm.put("ToyName_2", new Toys("ToyName_2", 100));
      tm.put("ToyName_3", new Toys("ToyName_3", 150));
      tm.put("ToyName_4", new Toys("ToyName_4", 200));
      tm.put("ToyName_5", new Toys("ToyName_5", 250));

      System.out.println(tm);

      System.out.println(tm.get("ToyName_4"));

      enumerateKey(tm);

      enumerateValues(tm);


    }

    private static void enumerateKey(Map<String, Toys> toyMap) {
      Set<String> keys = toyMap.keySet();
      for (String key : keys) {
        System.out.println(key);
//      System.out.println(toyMap.get(key));
      }
    }

    private static void enumerateValues(Map<String, Toys> map) {
      Collection<Toys> values = map.values();
//    for (Toy value : values) {
//
//      System.out.println(values);
//    }
      values.forEach(System.out::println);
    }
  }


  class Toys {
    String name;
    int cost;

    public Toys(String name, int cost) {
      this.name = name;
      this.cost = cost;
    }

    @Override
    public String toString() {
      return "Toys{" +
              "name='" + name + '\'' +
              ", cost=" + cost +
              '}';
    }
  }
