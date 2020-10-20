public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        ListNode head = list;
        if (list == null) {
            return null;
        }
        while (list != null){
            for (int k=0; k<amount-1; k+=1) {
                ListNode current = list;
                ListNode temp = new ListNode(current.info, list.next);
                list.next = temp;
                list = list.next;
            }
            list = list.next;
        }
        return head;
    }
}
