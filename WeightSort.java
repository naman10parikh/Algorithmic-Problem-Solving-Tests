import java.util.*;

public class WeightSort {
    public String[] sort(String[] strs) {
        Arrays.sort(strs, new comparisonmethod());
        return strs;
    }
    public class comparisonmethod implements Comparator<String>{
        public int compare(String str1, String str2) {
            int comp1 = 0, comp2 = 0;
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            for (int k=0; k<str1.length(); k+=1)
            {
                char ch1 = str1.charAt(k);
                int count = ch1-'a' +1;
                comp1 += count;
            }
            for (int k=0; k<str2.length(); k+=1)
            {
                char ch2 = str2.charAt(k);
                int count = ch2-'a' +1;
                comp2 += count;
            }
            if (comp1==comp2)
            {
                return str1.compareTo(str2);
            }
            if (comp2>comp1)
            {
                return -1;
            }
            if (comp1>comp2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}