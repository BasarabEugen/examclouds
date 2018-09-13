/**
 * Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Toy).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен игрушек  - keySet().
 * Перебрать и распечатать значения игрушек - values().
 * Для каждого перебора создать свой метод. (Задание с урока)
 */
package lesson16.lesson16_4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * basar
 * 29.08.2018
 * examclouds
 */
public class Lesson16_4 {

  public static void main(String[] args) {
    Map<String, Toy> toyMap = new HashMap<>();

    toyMap.put("ToyName_1", new Toy("ToyName_1", 50));
    toyMap.put("ToyName_2", new Toy("ToyName_2", 100));
    toyMap.put("ToyName_3", new Toy("ToyName_3", 150));
    toyMap.put("ToyName_4", new Toy("ToyName_4", 200));
    toyMap.put("ToyName_5", new Toy("ToyName_5", 250));


    System.out.println(toyMap);

    System.out.println(toyMap.get("ToyName_4"));

    enumerateKey(toyMap);

    enumerateValues(toyMap);


  }

  private static void enumerateKey(Map<String, Toy> toyMap) {
    Set<String> keys = toyMap.keySet();
    for (String key : keys) {
      System.out.println(key);
//      System.out.println(toyMap.get(key));
    }
  }

  private static void enumerateValues(Map<String, Toy> map) {
    Collection<Toy> values = map.values();
//    for (Toy value : values) {
//
//      System.out.println(values);
//    }
    values.forEach(System.out::println);
  }
}


class Toy {
  String name;
  int cost;

  public Toy(String name, int cost) {
    this.name = name;
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "Toy{" +
            "name='" + name + '\'' +
            ", cost=" + cost +
            '}';
  }
}