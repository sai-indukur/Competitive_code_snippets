//141. Linked List Cycle LeetCode
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        ListNode l1=head;
        ListNode l2=head.next;
        while(l1!=null && l2!=null && l2.next!=null)
        {
            if(l1==l2)
                return true;
            l1=l1.next;
            l2=l2.next.next;
        }
        return false;
    }
}
