public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] output = new int[matches.length];
        for(int i=0; i < matches.length; i++){
            String game = matches[i];
            for(int j=0; j<game.length(); j++){
                char gameresult = game.charAt(j);
                if(gameresult=='W'){output[i] += 3;}
                else if(gameresult=='D'){
                    output[i] += 1;
                    output[j] += 1;}
                else if(gameresult=='L'){output[j] += 3;}
            }
        }
        return output;
    }
}
