public ListNode (ListNode list)
{
    public ListNode duplicate (ListNode list)
    {
        ListNode list2=copy(list);
        ListNode list3=last(list2);
        ListNode list4=copy(list3);
        return list4;
    }
}

ListNode first = new ListNode(s.charAt(0), null);
last.next = new ListNode(s.charAt(k), null);
last=last.next;

ListNode second = list.next;
list.next=list.next.next;
temp.next=first;
