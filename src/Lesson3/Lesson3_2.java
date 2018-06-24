package Lesson3;/*
 * Created by basar on 23.06.2018

Создать программу, в которой последовательно прописать преобразования всех совместимых примитивных типов друг к другу.
Преобразование для каждого типа вынесите в отдельный метод.
*/

public class Lesson3_2 {
    public static void main(String[] args) {
    toByte();
    toShort();
    toChar();
    toInt();
    toLong();
    toFloat();
    toDouble();

    }
    private static void toByte(){
        byte b = 1;
        short s = 2;
        char ch = 3;
        int i = 4;
        long l = 5;
        float f = 6.1f;
        double d = 7.2;
        boolean t = true;
//        b =  b;
//        System.out.println("byte to byte: "+ b + " - " + b);
        b = (byte) s;
//        System.out.println("short to byte: "+ s + " - "  + b);
        b = (byte) ch;
//        System.out.println("char to byte: "+ ch + " - "  + b);
        b = (byte) i;
//        System.out.println("int to byte: "+ i + " - "  + b);
        b = (byte)l;
//        System.out.println("long to byte: "+ l + " - "   + b);
        b = (byte)f;
//        System.out.println("float to byte: "+ f + " - "   + b);
        b = (byte)d;
//        System.out.println("double to byte: "+ d + " - "   + b);
    }
    private static void toShort(){
        byte b = 1;
        short s = 2;
        char ch = 3;
        int i = 4;
        long l = 5;
        float f = 6.1f;
        double d = 7.2;
        boolean t = true;

        s = b;
//        s = s;
        s = (short) ch;
        s = (short) i;
        s = (short) l;
        s = (short) f;
        s = (short) d;
    }
    private static void toChar(){
        byte b = 1;
        short s = 2;
        char ch = 3;
        int i = 4;
        long l = 5;
        float f = 6.1f;
        double d = 7.2;
        boolean t = true;

        ch = (char)b;
        ch = (char)s;
//        ch = ch;
        ch = (char) i;
        ch = (char) l;
        ch = (char) f;
        ch = (char) d;
    }
    private static void toInt(){
        byte b = 1;
        short s = 2;
        char ch = 3;
        int i = 4;
        long l = 5;
        float f = 6.1f;
        double d = 7.2;
        boolean t = true;

        i = b;
        i = s;
        i = ch;
//        i =  i;
        i = (int) l;
        i = (int) f;
        i = (int) d;
    }
    private static void toLong(){
        byte b = 1;
        short s = 2;
        char ch = 3;
        int i = 4;
        long l = 5;
        float f = 6.1f;
        double d = 7.2;
        boolean t = true;

        l = b;
        l = s;
        l = ch;
        l =  i;
//        l =  l;
        l = (long) f;
        l = (long) d;
    }
    private  static void toFloat(){
        byte b = 1;
        short s = 2;
        char ch = 3;
        int i = 4;
        long l = 5;
        float f = 6.1f;
        double d = 7.2;
        boolean t = true;

        f = b;
        f = s;
        f = ch;
        f =  i;
        f =  l;
//        f =  f;
        f = (float) d;
    }
    private static void toDouble(){
        byte b = 1;
        short s = 2;
        char ch = 3;
        int i = 4;
        long l = 5;
        float f = 6.1f;
        double d = 7.2;
        boolean t = true;

        d = b;
        d = s;
        d = ch;
        d =  i;
        d =  l;
        d =  f;
//        d =  d;
    }
}
