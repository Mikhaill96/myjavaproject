//3 задание
public class PrintColor{
    public static void main(String[] args) {
        int value = - 111;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0  && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}