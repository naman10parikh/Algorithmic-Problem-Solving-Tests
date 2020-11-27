import java.util.*;

public class SpecialSort {
    public String[] strspecial;
    public String[] sort(String[] data, String[] special)
    {
        strspecial = special;
        Arrays.sort(data, new comparisonmethod2());
        return data;
    }
    public class comparisonmethod2 implements Comparator<String>
    {
        public int compare(String str1, String str2) {
            if (Arrays.asList(strspecial).contains(str1) && Arrays.asList(strspecial).contains(str2))
            {
                return str1.compareTo(str2);
            }
            if (!Arrays.asList(strspecial).contains(str1) && !Arrays.asList(strspecial).contains(str2))
            {
                return str1.compareTo(str2);
            }
            if (Arrays.asList(strspecial).contains(str1))
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
    }
}
