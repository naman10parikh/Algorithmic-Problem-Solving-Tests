import java.util.HashMap;

public class Encryption {
    public String encrypt(String message) {
        String totalphabet = "abcdefghijklmnopqrstuvwxyz";
        HashMap lettercode = new HashMap();
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (!lettercode.containsKey(letter)) {
                lettercode.put(letter, totalphabet.charAt(count));
                count += 1;
            }
        }
        char[] array = new char[message.length()];
        for (int j = 0; j < message.length(); j++) {
            array[j] = (Character) lettercode.get(message.charAt(j));
        }
        String finresult = new String(array);
        return finresult;
    }
}
