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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        
        int carry = 0;
        
        while(l1 != null || l2 != null)
        {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            int curr_sum = val1 + val2 + carry;
            carry = curr_sum / 10;
            int next_digit = curr_sum % 10;
            
            ListNode new_node = new ListNode(next_digit);
            temp.next = new_node;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            temp = temp.next;
        }
        if(carry > 0)
        {
            ListNode new_node = new ListNode(carry);
            temp.next = new_node;
            temp = temp.next;
        }
        
        return dummy.next;
        
    }
}