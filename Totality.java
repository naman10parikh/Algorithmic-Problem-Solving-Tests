public class Totality {
    public int sum(int[] a, String stype) {
        int answer=0;
        int k;
        if (a.length>=2 && a.length<=50) {
            if (stype.equals("even"))
            {
                for (k=0; k < a.length; k+=2) {
                    answer+=a[k];
                }
            }
            else if (stype.equals("odd")) {
                for (k = 1; k < a.length; k+=2) {
                    answer+=a[k];
                }
            }
            else if (stype.equals("all")) {
                for (k = 0; k < a.length; k+=1) {
                    answer+=a[k];
                }
            }
            return answer;
        }
        return 0;
    }
}