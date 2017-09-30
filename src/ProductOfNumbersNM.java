import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbersNM {
public static void main (String[]arg){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int i = n;
    int m = input.nextInt();
    BigInteger result = BigInteger.ONE;
   do{
    BigInteger num = BigInteger.valueOf(i);
    result = result.multiply(num);
    i++;
   }while(i<=m);
    System.out.println("product[" + n +".."+ m + "] = " + result);

}
}
