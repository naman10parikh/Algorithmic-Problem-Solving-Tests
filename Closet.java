import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Closet {
    public String anywhere(String[] list) {
        ArrayList<String> finalwords = new ArrayList<>();
        List<String> myList;
        for (int k=0; k<list.length; k+=1) {
            String[] arraywords = list[k].split(" ");
            for (int j = 0; j < arraywords.length; j += 1) {
                if (!finalwords.contains(arraywords[j]))
                {
                    finalwords.add(" ");
                    finalwords.add(arraywords[j]);
                }
            }
            Arrays.fill(arraywords, null);
        }
        myList=finalwords;
        Collections.sort(myList);
        String liststring="";
        for (String s: myList)
        {
            liststring=liststring.concat(s).concat(" ");
        }
        return liststring.trim();
    }
}
