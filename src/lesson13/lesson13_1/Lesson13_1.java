package lesson13.lesson13_1;
/* Создать properties файлы на русском и английским, содержащие названия изученных тем по Java.
     * Создать метод, который получает в качестве параметра локаль и распечатывает всю информацию из properties файла.
     * Используем метод ResourceBundle.keySet().
     * */

    import java.io.UnsupportedEncodingException;
    import java.util.Locale;
    import java.util.ResourceBundle;

    public class Lesson13_1 {
        public static void main(String[] args) throws UnsupportedEncodingException {
        printKey(new Locale("ru", "RU"));
        printKey(new Locale("en", "US"));
        }
        static void printKey(Locale locale) throws UnsupportedEncodingException {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("lang", locale);
            for(String key : resourceBundle.keySet()){
                String value = resourceBundle.getString(key);
                value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
                System.out.println(resourceBundle.getString(key));

            }
        }
    }
