package lesson7.lesson7_1;/*
 * Created by basar on 29.06.2018
 */

class Phone {

    String number;
    String model;
    double weight;

    Phone(String n, String m, double w){
        this(n, m);
        weight = w;
    }

    Phone(String n, String m){
        number = n;
        model = m;
    }

    Phone(){
    }

    void receiveCall(String name){
        System.out.println("Call now " + name);
    }

    void receiveCall(String name, String number){
        System.out.println(name + " " + number);
    }

    String getNumber(){
        return number;
    }

    void sendMessage(String... numbers){
        for (String element: numbers) {
            System.out.println(element);
        }
    }
}

