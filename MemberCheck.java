import java.util.ArrayList;
import java.util.Arrays;

public class MemberCheck {
   public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        ArrayList<String> dishonestmember = new ArrayList<String>();
        for (int i = 0; i < club1.length; i ++) {
            if(containsMember(club2, club1[i])){
                if(!dishonestmember.contains(club1[i])) {
                    dishonestmember.add(club1[i]);
                }
            }
            if(containsMember(club3, club1[i])){
                if(!dishonestmember.contains(club1[i])) {
                    dishonestmember.add(club1[i]);
                }
            }
        }
        for (int j = 0; j < club2.length; j ++) {
            if(containsMember(club3, club2[j])){
                if(!dishonestmember.contains(club2[j])) {
                    dishonestmember.add(club2[j]);
                }
            }
        } 
        String[] otherdishonest = new String[dishonestmember.size()];
        otherdishonest = dishonestmember.toArray(otherdishonest);
        Arrays.sort(otherdishonest);
        return otherdishonest; 
    }

    private boolean containsMember(String[] club, String member) {
        for (String s: club) {
            if (s.equals(member))
                return true;
        }
        return false;
    }
}
