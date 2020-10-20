public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        String s="";
        int count=0;
        int maxlength=0;
        int maxcount=0;
        for  (int k = 0; k < strands.length; k += 1)
        {
                for (int i=0; i<strands[k].length(); i+=1)
                {
                    if (strands[k].charAt(i) == nuc.charAt(0)) {
                        count += 1;
                    }
                }
                if (strands[k].contains(nuc) && (strands[k].length()>maxlength) || count>maxcount)
                {
                    s="";
                    s=s.concat(strands[k]);
                    maxlength=strands[k].length();
                    maxcount=count;
                }
                count=0;
        }
        return s;
    }
}
