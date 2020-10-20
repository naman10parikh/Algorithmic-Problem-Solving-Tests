public class CirclesCountry {
    public boolean isIn(int origx, int origy, int R, int x, int y){
        boolean answer=true;
        int distsqr = (origx-x)*(origx-x) + (origy-y)*(origy-y);
        if(distsqr>R*R)
            answer=false;
        if(distsqr<R*R)
            answer=true;
        return answer;
    }
    public int leastBorders(int[] X, int[] Y, int[] R,
                            int x1, int y1, int x2, int y2) {
        int ans = 0;
        for(int i=0; i<X.length; i+=1){
            boolean in1 = isIn(X[i], Y[i], R[i], x1, y1);
            boolean in2 = isIn(X[i], Y[i], R[i], x2, y2);
            if( (in1&&in2) || (!in1&&!in2) ){
                //pass
            }
            else if (in1 || in2) {
                ans += 1;
            }
        }
        return ans;
    }
};