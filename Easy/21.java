class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l = head;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while(p1!=null && p2!=null) {
            if(p1.val < p2.val) {
                l.next = p1;
                p1 = p1.next;
            }
            else {
                l.next = p2;
                p2 = p2.next;
            }
            l = l.next;
        }
        if(p1!=null) {
            l.next = p1;
        }
        if(p2!=null) {
            l.next = p2;
        }
        return head.next;
    }
}