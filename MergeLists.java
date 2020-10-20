public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        ListNode mainnode = new ListNode(a.info, null);
        ListNode retain = mainnode;
        mainnode.next = new ListNode(b.info, null);
        mainnode = mainnode.next;
        if (a.next == null) {
            return retain;
        }
        a = a.next;
        b = b.next;
        while (a.next != null) {
            mainnode.next = new ListNode(a.info, null);
            mainnode = mainnode.next;
            a = a.next;
            mainnode.next = new ListNode(b.info, null);
            mainnode = mainnode.next;
            b = b.next;
        }
        mainnode.next = new ListNode(a.info, null);
        mainnode = mainnode.next;
        a = a.next;
        mainnode.next = new ListNode(b.info, null);
        mainnode = mainnode.next;
        b = b.next;
        return retain;
    }
}
