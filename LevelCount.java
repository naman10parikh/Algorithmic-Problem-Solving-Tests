import java.util.ArrayList;

public class LevelCount {
    private ArrayList<Integer> arrlist = new ArrayList<>();
    public int count(TreeNode t1, int l1) {
        nums(t1, 0, l1);
        return arrlist.size();
    }
    public void nums (TreeNode t2, int currentl2, int l2) {
        if (t2 == null) {
            return;
        }
        if (currentl2 == l2) {
            arrlist.add(currentl2);
            return;
        }
        currentl2 += 1;
        nums(t2.left, currentl2, l2);
        nums(t2.right, currentl2, l2);
    }
}
