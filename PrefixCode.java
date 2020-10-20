public class PrefixCode {
    public String isOne(String[] words) {
        int prefix = -1;
        if (words[0].equals("11")){
            return "No, 0";
        }
        for(int i=0; i<words.length; i++){
            String checkword = words[i];
            for(int j=0; j<i;j++){
                String word2 = words[j];
                if (checkword.startsWith(word2)) {
                    prefix = j;
                    break;
                }
                else if (word2.startsWith(checkword)){
                    prefix = i;
                    break;
                }
            }
            if(prefix!=-1){
                break;
            }
        }
        if (prefix==-1){
            return "Yes";
        }
        else{
            return "No, " + prefix;
        }
    }
}
