public class TransportPrice {

    public static void main(String[] arg) {


        int n = 291;
        System.out.println(Integer.toBinaryString(n));
        int p = 5;
        int mask = ~(1 << p);
        System.out.println(Integer.toBinaryString(mask));
        int result = mask & n;
        System.out.println(Integer.toBinaryString(result));

//        System.out.println( Integer.toBinaryString(n));
//        int p = 5;
//        int mask = n >> p;
//        System.out.println( Integer.toBinaryString(mask));
//        int bit = mask & 1;
//        System.out.println( Integer.toBinaryString(bit));


//        System.out.println(Integer.toBinaryString(n));
//        int maskRight = n >> 3;//деля на 2 на степен 3
//        System.out.println(Integer.toBinaryString(maskRight));
//        System.out.println(maskRight);
//        int leftBit = n<<3;//умножавам по 2 на 4
//        System.out.println(Integer.toBinaryString(leftBit));
//        System.out.println(leftBit);

    }
}

//Scanner input = new Scanner(System.in);
//Integer kilometer = input.nextInt();
//String dayNight = input.nextLine();
//float initialTax = 0.7f;
//float dayTimeTax = 0.79f;
//float nightTimeTax = 0.9f;
//
//if(kilometer >= 20)
