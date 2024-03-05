//14 задание
public class CreateIntArray {
    public static int[] createIntArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] myArray = createIntArray(10, 1);
        for (int i : myArray) {
            System.out.println(i);
        }
    }
}

