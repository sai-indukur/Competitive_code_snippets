//19.Remove Nth Node From End of List LeetCode

 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int len=0;
        ListNode head1=head;
        

        while(head!=null)
        {
            len++;
            head=head.next;
        }
         head=head1;
        if(len==1)
            return null;
        if(len==n)
            return head.next;
       
        int tmp=0;
        while(tmp!=len-n-1)
        {
            head1=head1.next;
            tmp++;
        }
        head1.next=head1.next.next;
        return head;
        
    }
}
