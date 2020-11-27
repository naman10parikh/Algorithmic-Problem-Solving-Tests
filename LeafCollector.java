import java.util.*;

public class LeafCollector {
    public HashSet<TreeNode> hset;
    public String s;
    public ArrayList<String> arrlist;
    public String[] getLeaves(TreeNode t) {
        arrlist = new ArrayList<>();
        s = "";
        if (t == null)
        {
            return new String[0];
        }
        while (t.left != null || t.right != null)
        {
            hset = new HashSet<TreeNode>();
            arrlist.add(lefcalc(t));
            rem(t);
            s = "";
        }
        if (t.left == null && t.right == null)
        {
            arrlist.add(t.info + "");
        }
        String[] ans = new String[arrlist.size()];
        for (int k = 0; k < arrlist.size() - 1; k+=1)
        {
            ans[k] = arrlist.get(k);
        }
        for (int k = 0; k < ans.length - 1; k+=1)
        {
            StringBuilder sb = new StringBuilder();
            String capture = ans[k];
            sb.append(capture);
            sb.reverse();
            sb.deleteCharAt(0);
            sb.reverse();
            ans[k] = sb.toString();
        }
        ans[arrlist.size() - 1] = arrlist.get(arrlist.size() - 1);
        return ans;
    }
    public String lefcalc(TreeNode tn)
    {
        if (tn == null)
        {
            return s;
        }
        if (tn.right == null && tn.left == null) {
            s = s + tn.info + " ";
            hset.add(tn);
        }
        if (tn.left != null)
        {
            lefcalc(tn.left);
        }
        if (tn.right != null)
        {
            lefcalc(tn.right);
        }

        return s;
    }
    public TreeNode rem(TreeNode tn)
    {
        if (tn == null)
        {
            return null;
        }
        if (tn.left != null)
        {
            if (rem(tn.left) == null) {
                tn.left = null;
            }
        }
        if (tn.right != null)
        {
            if (rem(tn.right) == null) {
                tn.right = null;
            }
        }
        if(hset.contains(tn))
        {
            tn = null;
        }
        return tn;
    }
}


