//6 задание
public class NumberChecker {
    public static void main(String[] args) {
        checkNumber(10);
       }
    public static void checkNumber(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}