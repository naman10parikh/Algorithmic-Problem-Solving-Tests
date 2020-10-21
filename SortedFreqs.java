import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        Map<String, Integer> hmap = new HashMap<>();
        for (String str : data) {
            if (hmap.containsKey(str)) {
                hmap.put(str, hmap.get(str) + 1);
            } else {
                hmap.put(str, 1);
            }
        }
        ArrayList<String> arrlist = new ArrayList<>(hmap.keySet());
        Comparator<String> compare = Comparator.comparing(String::toString);
        Collections.sort(arrlist,compare);
        int[] arr = new int[arrlist.size()];
        int k = 0;
        for (String s : arrlist){
            int result = hmap.get(s);
            arr[k] = result;
            k ++;
        }
        return arr;
    }
}
