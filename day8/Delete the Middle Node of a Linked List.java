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
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode temp = head;
        if(head == null)
        {
            return null;
        }
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        if(size == 1)
        {
            return null;
        }
        
        int n = size/2-1;
        
        temp = head;
        while(n-->0){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        return head;
    }
}