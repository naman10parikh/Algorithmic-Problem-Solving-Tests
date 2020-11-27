import java.util.*;

public class TreeSort {
    public ArrayList<Integer> arrlist = new ArrayList<>();
    public int[] sort(TreeNode tree)
    {
        maketreesort(tree);
        Collections.sort(arrlist);
        int[] arr = new int[10];
        int count = 0;
        for (Integer k : arrlist) {
            int i = k;
            if (arr.length == count)
            {
                arr = Arrays.copyOf(arr, (count * 2));
            }
            arr[count++] = i;
        }
        arr = Arrays.copyOfRange(arr, 0, count);
        return arr;
    }
    public void maketreesort(TreeNode tn)
    {
        if (tn != null)
        {
            arrlist.add(tn.info);
            maketreesort(tn.left);
            maketreesort(tn.right);
        }
    }
}