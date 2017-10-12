import java.util.Scanner;

public class FindSpecificSquareInMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] size = input.nextLine().split(", ");
        int r = Integer.parseInt(size[0]);
        int c = Integer.parseInt(size[1]);
        int[][] matrix = new int [r][c];

        int bestSum=Integer.MIN_VALUE;
        int resultRow=0;
        int resultColumn=0;

        for (int row = 0; row < matrix.length; row++) {
            String[] line = input.nextLine().split(", ");
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column]= Integer.parseInt(line[column]);
            }
        }

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int column = 0; column < matrix[0].length - 1; column++){

                int sum = matrix[row][column] + matrix[row][column+1]+
                        matrix[row+1][column] + matrix[row+1][column+1];

                if (sum > bestSum){
                    bestSum=sum;
                    resultRow=row;
                    resultColumn=column;
                }
            }
        }


        System.out.println(matrix[resultRow][resultColumn] + " " + matrix[resultRow][resultColumn+1]);
        System.out.println(matrix[resultRow + 1][resultColumn] + " " + matrix[resultRow+1][resultColumn+1]);
        System.out.println(bestSum);
    }
}
