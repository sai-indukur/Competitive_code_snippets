//203. Remove Linked List Elements LeetCode
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
    public ListNode removeElements(ListNode head, int val) 
    {
        if(head==null)
            return null;
        while(head!=null && head.val==val)
        {
            head=head.next;
        }
        if(head==null)
            return null;
         ListNode head1=head;
        while(head!=null && head.next!=null)
        {
            if(head.next.val==val)
                head.next=head.next.next;
            else
                head=head.next;
        }
        
        return head1;
    }
}
