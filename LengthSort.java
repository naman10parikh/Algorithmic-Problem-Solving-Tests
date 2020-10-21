import java.util.Arrays;
import java.util.Comparator;

public class LengthSort {
    public String[] rearrange(String[] values){
        Comparator<String> compare = Comparator.comparing(String::length);
        compare = compare.thenComparing(String::toString);
        Arrays.sort(values,compare);
        return values;
    }
}