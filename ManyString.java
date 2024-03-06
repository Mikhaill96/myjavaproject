//8 задание
public class ManyString {
    public static void StringPrinter (String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        StringPrinter ("Хеллоу", 3);
    }
}