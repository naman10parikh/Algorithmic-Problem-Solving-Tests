import java.util.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {

        HashMap<Character, Integer> lettersAvailable = countLetters(headlines);
        int makewords = 0;
        for(String message : messages){
            String[] oneMessage = {message};
            HashMap<Character, Integer> lettersNeeded = countLetters(oneMessage);
            boolean makemessage = true;
            Iterator it = lettersNeeded.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry pairs = (Map.Entry)it.next();
                char key = (Character) pairs.getKey();
                if(!(key==' ')){
                    int numNeeded = (Integer) pairs.getValue();
                    if(lettersAvailable.containsKey(key)){
                        int numAvailable = lettersAvailable.get(key);
                        makemessage = (numNeeded <= numAvailable) && makemessage;
                    }
                    else{
                        makemessage = false ;
                        break;
                    }
                }

                it.remove();
            }
            if(makemessage){
                makewords += 1;
            }
        }
        return makewords;
    }

    public HashMap<Character, Integer> countLetters(String[] words){
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
        int currentCountOfLetter = 0;

        for(String word : words){
            for(int i=0; i<word.length(); i++){
                char letter = Character.toLowerCase(word.charAt(i));
                if (counts.containsKey(letter)){
                    currentCountOfLetter = counts.get(letter);
                    currentCountOfLetter +=1;
                }
                else {
                    currentCountOfLetter = 1;
                }
                counts.put(letter, currentCountOfLetter);
            }
        }

        return counts;
    }

}