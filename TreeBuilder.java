public class TreeBuilder {
    public TreeNode create(int[] values)
    {
        if (values.length<=0)
        {
            return null;
        }
        TreeNode r = orderlvl(values, new TreeNode(values[0]), 0);
        ordercalc(r);
        return r;
    }
    public void ordercalc(TreeNode r)
    {
        if (r != null) {
            ordercalc(r.left);
            System.out.print(r.info + " ");
            ordercalc(r.right);
        }
    }
    public TreeNode orderlvl(int[] values, TreeNode r, int k) {
        if (k < values.length)
        {
            TreeNode tn1 = new TreeNode(values[k]);
            r = tn1;
            r.left = orderlvl(values, r.left, 2 * k + 1);
            r.right = orderlvl(values, r.right,2 * k + 2);
        }
        return r;
    }
}