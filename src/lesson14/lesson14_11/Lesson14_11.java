package lesson14.lesson14_11;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.function.Function;

public class Lesson14_11 {
    public static void main(String[] args) {

        Function<String, Number> function = str -> {
            NumberFormat nf = NumberFormat.getInstance();
            try {
                return nf.parse(str);

            } catch (ParseException e) {
                return 0;
            }
        };
        System.out.println(function.apply("1"));
        System.out.println(function.apply("ABC"));
    }
}
