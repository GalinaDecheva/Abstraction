import java.math.BigInteger;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        BigInteger[][] matrix = new BigInteger[rows][];// деклариране на матрица

        for (int i = 0; i < rows; i++) {// инициализиране на матрица(заделяне на памет,записване на първоначалните стойностти)
            matrix[i] = new BigInteger[i + 1];
            matrix[i][0] = BigInteger.ONE;
            matrix[i][i] = BigInteger.ONE;
        }

        for (int i = 2; i < rows; i++) {  //обхождане на матрицата и изчисляване на елементите
            for (int j = 1; j < matrix[i].length - 1; j++) {
                matrix[i][j] = matrix[i-1][j-1].add(matrix[i-1][j]);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
