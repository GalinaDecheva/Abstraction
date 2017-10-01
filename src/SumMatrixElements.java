import java.util.Scanner;

public class SumMatrixElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] rc = input.nextLine().split(", ");
        int rows = Integer.parseInt(rc[0]);
        int cols = Integer.parseInt(rc[1]);
        int sum = 0;
        int matrix[][] = new int[rows][cols];

        for(int i = 0;i < rows; i ++){
            String[] singleRow = input.nextLine().split(", ");
            for(int j = 0;j < cols;j ++){
                sum +=Integer.parseInt(singleRow[j]);
               matrix[i][j] = Integer.parseInt(singleRow[j]);
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
