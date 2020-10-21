import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SyllableSorting {
    public String[] sortWords(String[] words) {
        Newclass list[] = new Newclass[words.length];
        for (int k = 0; k < list.length; k++) {
            list[k] = new Newclass(words[k]);
        }
        Arrays.sort(list, new comparesyllables());
        String answer[] = new String[list.length];
        for (int k = 0; k < answer.length; k++) {
            answer[k] = list[k].str;
        }
        return answer;
    }
}
class Newclass {
    String str;
    ArrayList<String> syllablesarr = new ArrayList<String>();
    ArrayList<String> sortedsyllablesarr;
    public Newclass(String text) {
        this.str = text;
        String syllables = "";
        boolean consonantcheck = true;
        for (int k = 0; k < text.length(); k++) {
            char character = text.charAt(k);
            if (checkifconsonant(character)) {
                if (!consonantcheck) {
                    this.syllablesarr.add(syllables);
                    syllables = "";
                    consonantcheck = true;
                }
            }
            else {
                consonantcheck = false;
            }
            syllables += character;
        }
        this.syllablesarr.add(syllables);
        sortedsyllablesarr = new ArrayList<String>(this.syllablesarr);
        Collections.sort(sortedsyllablesarr);
    }
    boolean checkifconsonant(char ch) {
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }
}
class comparesyllables implements Comparator<Newclass> {
    public int compare(Newclass w1, Newclass w2) {
        int ans = compare(w1.sortedsyllablesarr, w2.sortedsyllablesarr);
        if (ans != 0) {
            return ans;
        } else {
            return compare(w1.syllablesarr, w2.syllablesarr);
        }
    }
    int compare(ArrayList<String> s1, ArrayList<String> s2) {
        for (int k = 0;; k++) {
            if (k == s1.size() && k == s2.size()) {
                return 0;
            }
            if (k == s1.size()) {
                return -1;
            }
            if (k == s2.size()) {
                return 1;
            }
            String sy1 = s1.get(k);
            String sy2 = s2.get(k);
            if (!sy1.equals(sy2)) {
                return sy1.compareTo(sy2);
            }
        }
    }
}