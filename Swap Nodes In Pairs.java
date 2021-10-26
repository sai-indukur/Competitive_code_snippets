//24. Swap Nodes In Pairs LeetCode

// Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode head1=head;
        ListNode first=head;
        int count=0;
        ListNode second=head.next;
        while(head1!=null)
        {
            count++;
            head1=head1.next;
        }
        if(count%2==0){                                   /*if the number of nodes are even then the last two nodes must be 
                                                             swapped manually apart from the loop
                                                          */ 
        while(first.next.next!=null && second.next!=null)
        {
            int temp=first.val;
            first.val=second.val;
            second.val=temp;
            
            first=first.next.next;
            second=second.next.next;
        }
        
         int temp=first.val;
         first.val=second.val;
         second.val=temp;
        
        }
        else{
            while(first.next!=null)
            {
                int temp=first.val;
                first.val=second.val;
                second.val=temp;
            
                first=first.next.next;
                second=second.next.next;
            }
        }
      return head;  
    }
}
