public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null) return null;
        return new TreeNode(calcheight(t), rewire(t.left), rewire(t.right));
    }
    private int calcheight(TreeNode t) {
        if (t == null)
        {
            return 0;
        }
        return Math.max(calcheight(t.left) + 1, calcheight(t.right) + 1);
    }
}
