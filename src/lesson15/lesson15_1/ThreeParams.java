package lesson15.lesson15_1;/*
 * Created by BASARAB EUGEN on 22.08.2018
 */

public class ThreeParams<T,V,A> {
private T obj1;
private V obj2;
private A obj3;

    public ThreeParams(T obj1, V obj2, A obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void showTypes(){
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
        System.out.println(obj3.getClass().getName());
    }

    T getObj1(){
        return obj1;
    }
    V getObj2(){
        return obj2;
    }
    A getObj3(){
        return obj3;
    }
}
