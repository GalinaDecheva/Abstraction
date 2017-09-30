import java.util.Scanner;

public class ExtractBitFromInteger {
public static void main(String[] arg){
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int p = input.nextInt();
    int mask = n >> p;
    int bit = mask &1;
    System.out.println(Integer.toBinaryString(bit));
}
}
