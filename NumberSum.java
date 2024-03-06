//5 задание
public class NumberSum {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        System.out.println(isSumInRange(num1, num2));
    }
    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }
}
