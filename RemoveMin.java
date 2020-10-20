public class RemoveMin {
    public ListNode remove (ListNode list) {
        ListNode head = list;
        if ((list == null)||(list.next == null)){
            return null;
        }
        int minvalue = findminvalue(list);
        if ((list.next != null) && (list.info == minvalue)){
            ListNode change = new ListNode(list.next.info, list.next.next);
            return change;
        }
        while (list != null) {
            if ((list.next.next != null) && (list.next.info == minvalue)){
                list.next = list.next.next;
                return head;
            }
            else if ((list.next.next == null) && (list.info != minvalue)) {
                list.next = null;
                return head;
            }
            list = list.next;
        }
        return head;
    }
    public int findminvalue (ListNode list){
        int minvalue = list.info;
        while (list != null) {
            ListNode first = list;
            if (minvalue > first.info){
                minvalue = first.info;
            }
            list = list.next;
        }
        return minvalue;
    }
}
