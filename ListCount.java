public class ListCount {
    public int count(ListNode list) {
        int counts = 0;
        while (list != null) {
            counts += 1;
            list = list.next;
        }
        return counts;
    }
}
