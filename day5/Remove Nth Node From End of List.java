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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        
        int l=0;
        while(temp != null)
        {
            l++;
            temp = temp.next;
        }
        
        int res = l-n;
        
        if(l == 1)
        {
            return null;
        }
        if(l== n)
        {
            return head.next;
        }
        ListNode curr = null;
        temp = head;
        while(res-->0)
        {
            curr = temp;
            temp = temp.next;
        }
        curr.next = temp.next;
        return head;
    }
}