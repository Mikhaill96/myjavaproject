//13 задание
public class DiagonalArray {
    public static void main(String args[]) {
        int counter = 5;
        int[][] table = new int[counter][counter];
        for (int i = 0; i < counter; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}