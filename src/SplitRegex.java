public class SplitRegex {

    public static void main(String[] args) {
        String text = "gosho3maria4pesho1";
        String[]arrays = text.split("[0-9]+");

        for (String array : arrays){
            System.out.println(array);
        }
    }
}
