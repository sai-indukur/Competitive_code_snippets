//21. Merge Two Sorted Lists LeetCode
// Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
      ListNode ans= new ListNode();  
        ListNode a=ans;
        while(l1!=null && l2!=null)
        {
                if(l1.val<=l2.val)
                {
                    ListNode temp=new ListNode(l1.val);
                    ans.next=temp;
                    l1=l1.next;
                }
                    
                else
                {
                    ListNode temp=new ListNode(l2.val);
                    ans.next=temp;
                    l2=l2.next;
                }
            ans=ans.next;
        }
        if(l1!=null)
        {
            ans.next=l1;
        }
        if(l2!=null)
        {
            ans.next=l2;
        }
        
       return a.next; 
    }
}
