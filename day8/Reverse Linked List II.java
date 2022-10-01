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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode(0);;
        ListNode  pre = dummy;
		dummy.next = head;
        ListNode start = head;
        ListNode then = head;
            
        if( head == null)
        {
            return null;
        }
            for(int i= 0; i< left -1; i++)
            {
                 pre = pre.next;
            }
        
        start = pre.next;
        then = start.next;
        
        for(int i=0; i<right - left; i++)
        {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }      
        
        return dummy.next;
    }
}