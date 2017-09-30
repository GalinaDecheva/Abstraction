import java.util.Scanner;

public class ModifyABit {
public static void main(String[]arg){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int p = input.nextInt();
    int v = input.nextInt();
    //System.out.println( Integer.toBinaryString(n));

    if(v == 1){
        int mask = 1<< p;
        //System.out.println(Integer.toBinaryString(mask));
        int result = n | mask;
        //System.out.println(Integer.toBinaryString(result));
        System.out.println(result);
    }else if (v == 0){
    int mask = ~(1 << p);
        //System.out.println(Integer.toBinaryString(mask));
    int result = n & mask;
        //System.out.println(Integer.toBinaryString(result));
        System.out.println(result);
    }


    }

    }







