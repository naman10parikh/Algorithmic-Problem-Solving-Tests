public class UniqueNodes {
    public int sum(ListNode list) {
        int sum=0;
        ListNode pointer1 = list;
        ListNode pointer2 = null;
        ListNode temp = null;
        while (pointer1 != null && pointer1.next != null) {
            pointer2 = pointer1;
            while (pointer2.next != null) {
                if (pointer1.info == pointer2.next.info) {
                    temp = pointer2.next;
                    pointer2.next = pointer2.next.next;
                } else  {
                    pointer2 = pointer2.next;
                }
            }
            pointer1 = pointer1.next;
        }
        while (list!=null)
        {
            sum=sum+list.info;
            list=list.next;
        }
        return sum;
    }
}
