package lesson15.lesson15_2;

import javax.swing.*;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * basar
 * 27.08.2018
 * examclouds
 */
public class Lesson15_2 implements Comparable<Lesson15_2>{
    Character c;

    public Lesson15_2(Character c) {
        this.c = c;
    }

    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("G");

//        System.out.println(((TreeSet<String>) treeSet).subSet("A", "C"));
//        System.out.println(((TreeSet<String>) treeSet).tailSet("C"));

        for (String str:treeSet){
            System.out.println(str);
        }

    }

    @Override
    public int compareTo(Lesson15_2 o) {
        return 0;
    }
}
