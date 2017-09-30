import java.util.*;

public class EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] names = new String[n];
        input.nextLine();

        for (int i = 0; i < names.length; i++) {
            String line = input.nextLine();
            names[i] = line;
        }

        int[] encryptArray = encryptNames(names);
        Arrays.sort(encryptArray);
        print(encryptArray);

    }

    public static int[] encryptNames(String names[]) {
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');

        int[] result = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            int sum = 0;
            //System.out.println(names[i]);

            for (int j = 0; j < names[i].length(); j++) {
                if (vowels.contains(names[i].charAt(j))) {
                    sum += (int) (names[i].charAt(j)) * names[i].length();
                } else {
                    sum += (int) (names[i].charAt(j)) / names[i].length();
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
