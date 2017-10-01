import java.util.Scanner;

public class ReadMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = Integer.parseInt(input.nextLine());
        int cols = Integer.parseInt(input.nextLine());
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] singleRow = input.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(singleRow[j]);
            }
        }
    }
}
