import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pangram {
    public String[] find(String[] phrases){
        ArrayList<String> arr=new ArrayList<>();
        for (String str: phrases) {
            if (verifypangram(str)==true)
            {
                arr.add(str);
            }
        }
        Collections.sort(arr);
        String[] newest = new String[arr.size()];
        for(int k =0;k<arr.size();k+=1){
            newest[k] = arr.get(k);
        }
        return newest;
    }
    public static boolean verifypangram(String str)
    {
        boolean[] check = new boolean[26];
        int ind = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                ind = str.charAt(i) - 'a';
            }
            else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                ind = str.charAt(i) - 'A';
            }
            check[ind] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!check[i]) {
                return (false);
            }
        }
        return (true);
    }
}

