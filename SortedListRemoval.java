public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
        ListNode first=list;
        while (first!=null)
        {
            ListNode temp=first;
            while (temp!=null && temp.info==first.info)
            {
                temp=temp.next;
            }
            first.next=temp;
            first=first.next;
        }
        return list;
    }
}
