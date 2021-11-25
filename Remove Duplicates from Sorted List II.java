//82. Remove Duplicates from Sorted List II
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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode ans=new ListNode();
        ListNode answer=ans;
        Map<Integer,Integer> m=new TreeMap<Integer,Integer>();
        while(head!=null)
        {
            m.put(head.val,m.getOrDefault(head.val,0)+1);
            head=head.next;
        }
        for(Integer i:m.keySet())
        {
            if(m.get(i)==1)
            {
                ListNode temp=new ListNode(i);
                ans.next=temp;
                ans=temp;
            }
        }
        return answer.next;
        
    }
}
