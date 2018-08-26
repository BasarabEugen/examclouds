package lesson15.lesson15_1;/*
 * Created by BASARAB EUGEN on 22.08.2018
 */

public class Lesson15_1 {
    public static void main(String[] args) {
        ThreeParams<Integer, String, Boolean> tgObj = new ThreeParams<>(101, "SYSTEM", false);
        tgObj.showTypes();
        int v = tgObj.getObj1();
        System.out.println(v);

        String str = tgObj.getObj2();
        System.out.println(str);

        Boolean a = false;
        System.out.println(a);
    }
}
