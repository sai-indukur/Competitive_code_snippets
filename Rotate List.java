//61. Rotate List
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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null|| head.next==null)
            return head;
        ListNode tmp=head;
        int length=0;
        while(tmp!=null)
        {
            length++;
            tmp=tmp.next;
        }
        tmp=head;
        
        int rem=k%length;
        k=rem;
        
         for(int i=0;i<k;i++)
        {
            tmp=rotateList(tmp,length);
        }
        return tmp;
    }
        public ListNode rotateList(ListNode head,int length)
        {
            int l=0;
            ListNode initial=head;
            ListNode tmp=null;
            while(head!=null)
            {
                l++;
                if(l==length-1)
                {
                    tmp=head.next;
                    head.next=null;
                }
                head=head.next;
            }
            tmp.next=initial;
            return tmp;
        }
    }
