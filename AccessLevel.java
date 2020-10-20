public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String s="";
        for (int k = 0; k < rights.length; k += 1) {
            if (rights[k] >= minPermission && rights[k] <= 100) {
                s=s.concat("A");
            }
            else if (rights[k] < minPermission) {
                s=s.concat("D");
            }
        }
        return s;
    }
}
