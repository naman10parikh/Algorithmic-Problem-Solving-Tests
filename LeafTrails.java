import java.util.*;

public class LeafTrails {
    TreeMap<Integer, String> mytreemap = new TreeMap<Integer, String>();
    public String[] trails(TreeNode tree) {
        if (tree == null)
        {
            return new String [0];
        }
        movethrough(tree, "");
        String[] calctrails = new String [mytreemap.size()];
        int c = 0;
        for (int val : mytreemap.keySet()) {
            calctrails[c] = mytreemap.get(val);
            c += 1;
        }
        return calctrails;
    }
    public void movethrough(TreeNode t, String str) {
        if (!(t.left == null))
        {
            movethrough(t.left, str + "0");
        }
        if (!(t.right == null))
        {
            movethrough(t.right, str + "1");
        }
        if (t.left == null && t.right == null)
        {
            mytreemap.put(t.info, str);
        }
    }
}