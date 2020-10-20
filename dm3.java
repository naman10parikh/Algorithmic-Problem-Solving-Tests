import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class dm3 {
    public ArrayList<String> maxKey(HashMap<String, ArrayList<String>> map)
    {
        int max = 0;
        String maxs = "";
        for (String s: map.keySet()) {
            if (map.get(s).size() > max) {
                max = map.get(s).size();
                maxs = s;
            }
        }
        return map.get(maxs);
    }
    public static void main (String[] args)
    {
        dm3 local = new dm3();
        String[] array = {"goes", "to", "duke"};
        String result=local.maxKey(map, array);
    }

    /*
        public static HashMap<Integer, HashSet<String>> getWords (Scanner s)
        {
            HashMap<Integer, HashSet<String>> map = new HashMap<>();
            while (hasNext())
            {
                String t = s.next();
                if (!map.containsKey(t.length())
                {
                    map.put(t.length(), new HashSet<String>());
                }
                for (int a=2, a<=map.size(); a+=1)
                {
                    if (a==t.length())
                    {
                        map.get(a).add(t);
                    }
                }
            }
        }
        return map;
*/
}

