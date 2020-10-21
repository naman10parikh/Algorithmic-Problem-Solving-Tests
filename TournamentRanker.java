import java.util.*;

public class TournamentRanker {
    public String[] rankTeams(String[] names, String[] lostTo) {
        int nameslength = names.length;
        Newclass parr[] = new Newclass[nameslength];
        for (int k = 0; k < nameslength; k+=1) {
            parr[k] = new Newclass(names[k], lostTo);
        }
        for (int k = 0; k < nameslength; k+=1) {
            parr[k].populateLostTo(k, lostTo, parr);
        }
        Arrays.sort(parr);
        String str[] = new String[nameslength];
        for (int k = 0; k < nameslength; k+=1) {
            str[k] = parr[k].pname;
        }
        return str;
    }
    public class Newclass implements Comparable<Newclass> {
        public final String pname;
        private Newclass loser;
        private int winner;
        public Newclass(String pname, String[] loser) {
            this.pname = pname;
            this.winner = 0;
            for (int k = 0; k < loser.length; k+=1) {
                if (loser[k].equals(pname)) {
                    winner+=1;
                }
            }
        }
        public void populateLostTo(int index, String[] lostTo, Newclass[] players) {
            for (int k = 0; k < lostTo.length; k+=1) {
                if (players[k].pname.equals(lostTo[index])) {
                    this.loser = players[k];
                    break;
                }
            }
        }
        public int compareTo(Newclass o) {
            if (winner != o.winner)
            {
                return o.winner - winner;
            }
            else {
                return loser.compareTo(o.loser);
            }
        }
    }
}
