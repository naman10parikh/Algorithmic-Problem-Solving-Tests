import java.util.*;

public class Thesaurus {
    boolean verifycombo = true;
    public String[] edit(String[] entry) {
        ArrayList<Set<String>> total = new ArrayList<Set<String>>();
        for (String input : entry) {
            Set<String> words = new TreeSet<String>(Arrays.asList(input.split(" ")));
            total.add(words);
        }
        ArrayList<Set<String>> nextarr = combo(total);
        while (verifycombo==true) {
            nextarr = combo(nextarr);
        }
        ArrayList<String> arrlist = new ArrayList<String>();
        for (Set<String> wordSet : nextarr) {
            arrlist.add(String.join(" ", wordSet));
        }
        String[] strlist = arrlist.toArray(new String[arrlist.size()]);
        Arrays.sort(strlist);
        return strlist;
    }

    public ArrayList<Set<String>> combo(ArrayList<Set<String>> setArray) {
        ArrayList<Set<String>> duplicatearr = new ArrayList<>(setArray);
        boolean out = false;
        for (int i = 0; i < duplicatearr.size(); i++) {
            if (out==true) {
                break;
            }
            for (int j = i + 1; j < duplicatearr.size(); j++) {
                Set<String> joined = duplicatearr.get(i);
                Set<String> duplicatejoined = new TreeSet<>(joined);
                duplicatejoined.retainAll(duplicatearr.get(j));
                if (duplicatejoined.size() >= 2) {
                    Set<String> newword = duplicatearr.get(i);
                    newword.addAll(duplicatearr.get(j));
                    duplicatearr.remove(i);
                    duplicatearr.remove(j - 1);
                    duplicatearr.add(newword);
                    out = true;
                    break;
                }
            }
            if (i == setArray.size() - 1) {
                verifycombo = false;
            }
        }
        return duplicatearr;
    }
}