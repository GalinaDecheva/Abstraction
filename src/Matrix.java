import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int [][] array = new int [3][4];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column]= row+column;//стойността на всяка клетка е равна на сбора на индексите
            }
        }

        for(int row = 0; row < array.length; row++){
            System.out.println(Arrays.toString(array[row]));
        }

    }
}
