public class TotalLetterCount {
    public int total(String[] words, String letter) {
        int count=0;
        int finsum=0;
        for (int k=0; k<words.length; k+=1)
        {
            for (int j=0; j<words[k].length(); j+=1)
            {
                if (String.valueOf(words[k].charAt(j)).equals(letter))
                {
                    count+=1;
                }
            }
            finsum=finsum+(k*count);
            count=0;
        }
        return finsum;
    }
}
