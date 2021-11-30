//86. Partition List.java
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
    
    public ListNode partition(ListNode head, int x) 
    {
        List<Integer> values=new ArrayList<Integer>();
        ListNode head1=head;
        while(head!=null)
        {
            if(head.val<x)
            {
               values.add(head.val);
            }
            head=head.next;
        }
        head=head1;
        while(head!=null)
        {
            if(head.val>=x)
                values.add(head.val);
            head=head.next;
        }
        head=head1;
        for(int i=0;i<values.size();i++)
        {
            head.val=values.get(i);
            head=head.next;
        }
        return head1;
        
    }
}
