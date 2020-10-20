public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        int div; int mod; int ans=0;
        for (int k = 0; k < sizes.length; k += 1) {
            div = sizes[k] / clusterSize;
            mod = sizes[k] % clusterSize;
            if (mod == 0 && sizes[k] == clusterSize && sizes[k]!=0) {
                ans=ans+clusterSize;
            }
            else if (mod==0 && sizes[k] > clusterSize && sizes[k]!=0)
            {
                ans = ans + (clusterSize * div);
            }
            else if (mod!=0 && sizes[k] < clusterSize && sizes[k]!=0)
            {
                ans = ans + clusterSize;
            }
            else if (mod!=0 && sizes[k] > clusterSize && sizes[k]!=0)
            {
                ans = ans + ((clusterSize * div) + clusterSize);
            }
        }
        return ans;
    }
}