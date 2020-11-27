import java.util.*;

public class AllPaths {
    private ArrayList<String> arrlist = new ArrayList<>();
    public String[] paths(TreeNode t) {
        if (t == null) {
            String[] s = new String[0];
            return s;
        }
        calcpath(t, "");
        Collections.sort(arrlist);
        String[] s1 = new String[arrlist.size()];
        s1 = arrlist.toArray(s1);
        return s1;
    }
    public void calcpath(TreeNode r, String p) {
        if (r == null) {
            return;
        }
        if (r.left == null && r.right == null) {
            p+=r.info;
            arrlist.add(p);
            return;
        }
        p+=(r.info + "->");
        calcpath(r.left, p);
        calcpath(r.right,p);
    }
}
