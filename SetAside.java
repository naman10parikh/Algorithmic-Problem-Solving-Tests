import java.util.Arrays;
import java.util.TreeSet;

public class SetAside {
    public String common(String[] list) {
        TreeSet<String> treeset = new TreeSet<String>();
        String result = "";
        for (String verify : list) {
            String[] split = verify.split(" ");
            for (String check2 : split)
                treeset.add(check2);
        }
        for (String verify : list) {
            String[] split = verify.split(" ");
            treeset.retainAll(Arrays.asList(split));
        }
        for (String str : treeset) {
            result = result + str;
            result = result + " ";
        }
        if(result.length() > 0)
        {
            return result.substring(0, result.length()-1);
        }
        else
        {
            return result;
        }
    }
}