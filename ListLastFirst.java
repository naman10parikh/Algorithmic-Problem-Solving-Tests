public class ListLastFirst {
    public ListNode move(ListNode list) {

      if ((list == null)||(list.next == null)){
            return list;
      }
      ListNode head = new ListNode(list.info, list.next);
      while (list.next.next != null){
          list = list.next;
          if (list.next.next==null) {
              ListNode first = new ListNode(list.next.info, head);
              list.next = null;
              return first;
          }
      }
      return list;
    }
}
