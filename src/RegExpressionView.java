import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionView {

    public static void main(String[] args) {
        String text = "Hello, it's Peter";
        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher m = pattern.matcher(text);

        while(m.find()){
        String matched = m.group(0);
            System.out.println(matched);
        }


        text = text.replaceAll("[A-Z][a-z]+", "*****");
        System.out.println(text);
    }
}
