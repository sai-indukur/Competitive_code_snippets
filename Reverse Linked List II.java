//92. Reverse Linked List II
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
class Solution
{
    Stack<Integer> s=new Stack<Integer>();
    
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        ListNode head1=head;
        ListNode l;
        ListNode r;
    
       l=getleft(head,left);
        ListNode l1=l;
       r=getright(head,right);
        
        while(l!=r.next)
        {
            s.add(l.val);
            l=l.next;
        }
        while(l1!=r.next)
        {
            l1.val=s.pop();
            l1=l1.next;
        }
        return head1;
        
    }
    public ListNode getleft(ListNode head,int left)
    {
        int count=1;
     while(head!=null)
        {
            if(count==left)
                break;
            head=head.next;
            count++;
        }
        return head;
    }
    public ListNode getright(ListNode head,int right)
    {
        int count=1;
        while(head!=null)
        {
            if(count==right)
                break;
            head=head.next;
            count++;
        }
        return head;
    }
        
}
