import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class AlphaLength {
    public static class myword implements Comparator<myword> {
        String str;
        public myword (String word) {
            str = word;
        }
        @Override
        public int compare(myword obj1, myword obj2) {
            String s1 = obj1.getWord();
            String s2 = obj2.getWord();
            int diff = 0;
            char c1, c2;
            for (int k = 0; k < s1.length(); k+=1) {
                if (s2.length() > k) {
                    c1 = s1.charAt(k);
                    c2 = s2.charAt(k);
                    diff = c1 - c2;
                }
                if (!(diff == 0)) return diff;
            }
            return 0;
        }

        public String getWord() {
            return str;
        }

    }

    public ListNode create(String[] words) {
        words = sorting(words);
        int word1 = words[0].length();
        ListNode ret = new ListNode(word1, null);
        ListNode first = ret;
        for (int k = 1; k < words.length; k+=1) {
            ret.next = new ListNode(words[k].length(), null);
            ret = ret.next;
        }
        return first;
    }

    public static String[] sorting (String[] words) {
        ArrayList<String> arrlist = new ArrayList<String>();
        for (int i = 0; i < words.length; i ++) {
            if (!(arrlist.contains(words[i]))) {
                arrlist.add(words[i]);
            }
        }
        Collections.sort(arrlist);
        String[] ret = new String[arrlist.size()];
        for (int k = 0; k < arrlist.size(); k+=1) {
            ret[k] = arrlist.get(k);
        }
        return ret;
    }
}
