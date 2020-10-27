import java.util.Collections;
import java.util.ArrayList;

public class SortedLeaves {
    private ArrayList<String> arrlist = new ArrayList<>();
    public String[] values(TreeNode tree) {
        calc(tree);
        Collections.sort(arrlist);
        String[] result = new String[arrlist.size()];
        result = arrlist.toArray(result);
        return result;
    }
    public void calc(TreeNode tree) {
        if (tree == null) {
            return;
        }
        if (tree.left == null && tree.right == null) {
            char chartonums = (char) tree.info;
            String string = Character.toString(chartonums);
            arrlist.add(string);
            return;
        }
        calc(tree.left);
        calc(tree.right);
    }
}
