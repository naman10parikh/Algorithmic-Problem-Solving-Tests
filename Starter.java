public class Starter {
    public int begins(String[] words, String first) {
        int a=0;
        for (int k=0; k < words.length; k+=1)
        {
            if (words[k].charAt(0)==first.charAt(0))
            {
                a+=1;
                for (int i=k+1; i<words.length; i++)
                {
                    if (words[k].equals(words[i]))
                    {
                            a=a-1;
                            break;
                    }
                }
            }
        }
        return a;
    }
}
