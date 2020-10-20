public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        int w=-1;
        int t=0;
        for(int m=0;m<orders.length;m++){
            t=0;
            String s = orders[m];
            String[] want=s.split(" ");
            for(int k=0;k<want.length; k++){
                w=-1;
                for(int i=0;i<available.length;i++){
                    if(available[i].equals(want[k])){
                        w++;
                    }
                }
                if(w==-1){t=-1;}
            }
            if(t==0){return m;}
        }
        return -1;
    }
}