import java.util.*;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        HashSet<Integer> hset = new HashSet<>();
        gothrough(root,hset);
        int[] arr = new int[hset.size()];
        int c = 0;
        for (int k : hset){
            arr[c] = k;
            c++;
        }
        Arrays.sort(arr);
        return arr;
    }
    public void gothrough(TreeNode r, HashSet<Integer> hs) {
        if (r == null)
        {
            return;
        }
        else
        {
            hs.add(r.info);
            gothrough(r.right,hs);
            gothrough(r.left,hs);
        }
        return;
    }
}
