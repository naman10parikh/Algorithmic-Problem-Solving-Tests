public class DoubleList {
    public ListNode bigify(ListNode list) {
        ListNode head = list;
        if (list == null) {
            return null;
        }
        while (list != null){
            ListNode temp = new ListNode(list.info);
            temp.next = list.next;
            list.next = temp;
            list = temp.next;
        }
        return head;
    }
}