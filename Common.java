import java.util.*;


public class Common {
    public int count(String a, String b) {
        /*int count=0;
        int fin=0;
        for (int k=0; k<a.length(); k++)
        {
            for (int j=0; j<b.length(); j++)
            {
                if (a.charAt(k)==b.charAt(j))
                {
                    count+=1;
                    if (count==1)
                    {
                        fin+=1;
                    }
                }
            }
            count=0;
        }
        return fin;
    }
}*/
        // To store the frequencies of characters
        // of string s1 and s2
        int []freq1 = new int[26];
        int []freq2 = new int[26];
        Arrays.fill(freq1, 0);
        Arrays.fill(freq2, 0);

        // To store the count of valid pairs
        int i, count = 0;

        // Update the frequencies of
        // the characters of string s1
        for (i = 0; i < a.length(); i++)
            freq1[a.charAt(i) - 'a']++;

        // Update the frequencies of
        // the characters of string s2
        for (i = 0; i < b.length(); i++)
            freq2[b.charAt(i) - 'a']++;

        // Find the count of valid pairs
        for (i = 0; i < 26; i++)
            count += (Math.min(freq1[i], freq2[i]));

        return count;

    }
}