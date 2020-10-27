public class TreeCount {
    public int count(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        int l = count(tree.left);
        int r = count(tree.right);
        return (l + r + 1);
    }
}