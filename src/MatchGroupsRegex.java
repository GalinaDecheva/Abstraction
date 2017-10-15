import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchGroupsRegex {

    public static void main(String[] args) {
            String url = "http://softuni.bg/cources";
            Pattern pattern = Pattern.compile("(https?|ftp)://([^/]+)(/.*)");
            Matcher m = pattern.matcher(url);
           m.find(); //първия резултат
        for (int i = 0; i < m.groupCount()+1; i++) {
            String MatchedGroup = m.group(i);
            System.out.println(MatchedGroup);
        }

    }
}
