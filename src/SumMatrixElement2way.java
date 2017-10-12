import java.util.Scanner;

public class SumMatrixElement2way {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][]matrix = new int [4][4];
        System.out.println(matrix.length );
        System.out.println( matrix[0].length);

        int sum = 0;
        for (int row = 0; row < matrix.length ; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum +=matrix[row][column];
            }

        }
        System.out.println(sum);
    }
}
