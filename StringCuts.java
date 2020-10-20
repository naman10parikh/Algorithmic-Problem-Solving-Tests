import java.util.ArrayList;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> arlist = new ArrayList<String>( );
        int count=0;
        for (int k=0; k<list.length; k+=1)
        {
            if (list[k].length()>=minLength)
            {
                while (!arlist.contains(list[k]))
                {
                    arlist.add(list[k]);
                }
            }
        }
        String[] finlist = new String[arlist.size()];
        for(int j =0;j<arlist.size();j++){
            finlist[j] = arlist.get(j);
        }
        return finlist;
    }
}