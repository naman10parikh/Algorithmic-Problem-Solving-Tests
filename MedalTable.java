import java.util.*;

public class MedalTable {
    public String[] generate(String[] results) {
        Map<String, int[]> hmap = new HashMap<>();
        for (String str : results){
            String[] country = str.split(" ");
            for (int k = 0; k < 3; k++){
                int[] addval = new int[3];
                String currentcountry = country[k];
                hmap.putIfAbsent(currentcountry, addval);
                addval = hmap.get(currentcountry);
                addval[k] += 1;
                hmap.put(currentcountry, addval);
            }
        }
        ArrayList<String> arrlist = new ArrayList<>(hmap.keySet());
        Comparator<String> compare = Comparator.comparingInt(s -> hmap.get(s)[0]);
        compare = compare.thenComparingInt(s -> hmap.get(s)[1]);
        compare = compare.thenComparingInt(s -> hmap.get(s)[2]);
        compare = compare.reversed();
        compare = compare.thenComparing(String::compareTo);
        Collections.sort(arrlist,compare);
        String[] finalarr = new String[arrlist.size()];
        int j = 0;
        for (String str1 : arrlist){
            int[] val = hmap.get(str1);
            String retVal = str1 + " " + val[0] + " " + val[1]+ " " + val[2];
            finalarr[j] = retVal;
            j ++;
        }
        return finalarr;
    }
}