package lesson14.lesson14_14;

public class Lesson14_14 {

    public void prepare(Cookable c){
        c.cook("STR");
    }
    public static void main(String[] args) {
        Lesson14_14 les = new Lesson14_14();
        les.prepare(System.out::println);
    }
}

interface Cookable{
    void cook(String str);
}
