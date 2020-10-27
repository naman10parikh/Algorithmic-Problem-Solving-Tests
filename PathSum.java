import java.util.ArrayList;

public class PathSum {
    private ArrayList<Integer> arrlist = new ArrayList<>();
    public int hasPath(int target, TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        add(tree, 0);
        for (int i = 0; i < arrlist.size(); i++) {
            int nums = arrlist.get(i);
            if (nums == target) return 1;
        }
        return 0;
    }
    private void add(TreeNode t, int addition) {
        if (t == null) {
            return;
        }
        if (t.left == null && t.right == null) {
            addition += t.info;
            arrlist.add(addition);
            return;
        }
        addition += t.info;
        add(t.left, addition);
        add(t.right, addition);
    }
}