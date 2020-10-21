import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        Map<String, Integer> hmap = new HashMap<>();
        for (String str : data) {
            if (hmap.containsKey(str)) {
                hmap.put(str, hmap.get(str) + 1);
            } else {
                hmap.put(str, 1);
            }
        }
        ArrayList<String> arrlist = new ArrayList<>(hmap.keySet());
        Comparator<String> compare = Comparator.comparingInt(s -> hmap.get(s));
        compare = compare.reversed().thenComparing(String::toString);
        Collections.sort(arrlist,compare);
        return arrlist.toArray(new String[0]);
    }
}