/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode dup=new ListNode(0,head);
        ListNode bef=dup,aft=head;
        while(aft!=null && aft.next!=null)
        {
            bef=bef.next;
            aft=aft.next.next;
        }
        bef.next=bef.next.next;
        return dup.next;
    }
}