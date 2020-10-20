public class TxMsg {
    public String getMessage(String original) {
        String words[] = original.split(" ");
        String answer = "";
        for (String str : words) {
            if (Vowels(str)) {
                answer += str + " ";
            } else {
                answer += text(str) + " ";
            }
        }
        return answer.trim();
    }

    public boolean Vowels(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
            if (count == s.length()) {
                return true;
            }
        }
        return false;
    }

    public String text(String s) {
        char[] array = s.toCharArray();
        String r = "";
        if (!(array[0] == 'a' || array[0] == 'e' || array[0] == 'i' || array[0] == 'o' || array[0] == 'u')) {
            r = r + array[0];
        }
        for (int k = 1; k < array.length; k += 1) {
            if (array[k] == 'a' || array[k] == 'e' || array[k] == 'i' || array[k] == 'o' || array[k] == 'u') {
                continue;
            } else if (array[k - 1] == 'a' || array[k - 1] == 'e' || array[k - 1] == 'i' || array[k - 1] == 'o' || array[k - 1] == 'u') {
                r = r + array[k];
            }
        }
        return r;
    }
}