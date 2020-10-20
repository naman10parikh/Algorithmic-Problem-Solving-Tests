import java.util.*;

public class AlphaCount {
    public int[] sizing(String[] words) {
        List <String> list=Arrays.asList(words);
        Set<String> ts = new TreeSet<>(list);
        int[] arraycount = new int[ts.size()];
        int a=0;
        for (String s: ts) {
            arraycount[a]=Collections.frequency(list, s);
            a++;
        }
        return arraycount;
    }
}


