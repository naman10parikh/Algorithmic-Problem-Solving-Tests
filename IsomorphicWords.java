import java.util.HashMap;
public class IsomorphicWords {
    public int countPairs(String[] words) {
        int isomorph = 0;
        for (int i = 0; i < words.length - 1; i++) {
            String firstword = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String secondword = words[j];
                HashMap<Character, Character> map = new HashMap<Character, Character>();
                for (int k = 0; k < firstword.length(); k++) {
                    boolean valuestored = map.containsValue(secondword.charAt(k));
                    boolean keystored = map.containsKey(firstword.charAt(k));
                    boolean keynotstored = !keystored;
                    if (valuestored && keynotstored) {
                        map.put(firstword.charAt(k), ' ');
                    } else if (valuestored && keystored) {
                        ;
                    } else {
                        map.put(firstword.charAt(k), secondword.charAt(k));
                    }
                }
                char[] array = new char[firstword.length()];
                for (int l = 0; l < firstword.length(); l++) {
                    array[l] = map.get(firstword.charAt(l));
                }
                String compareString = new String(array);
                if (secondword.equals(compareString)) {
                    isomorph += 1;
                }
            }
        }
        return isomorph;
    }
}
