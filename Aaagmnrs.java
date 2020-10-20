import java.util.ArrayList;
import java.util.HashSet;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        ArrayList<String> stringsleft = new ArrayList<String>();
        HashSet<String> finalset = new HashSet<String>();
        for (String s : phrases) {
            String word = s.toLowerCase().replace(" ", "");
            int counts[] = new int[26];
            for (int k = 0; k < word.length(); k++) {
                counts[word.charAt(k) - 'a']++;
            }
            String key = "";
            for (int k = 0; k < counts.length; k++) {
                for (int j = 0; j < counts[k]; j++) {
                    key += (char) ('a' + k);
                }
            }
            if (!finalset.contains(key)) {
                finalset.add(key);
                stringsleft.add(s);
            }
        }
        String answer[] = new String[stringsleft.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stringsleft.get(i);
        }
        return answer;
    }
}
