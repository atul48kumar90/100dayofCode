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
        ListNode head = l1;
        
        if(l1 == null && l2==null)
            return null;
        else if (l1==null && l2!=null)
            return l2;
        else if(l1!=null && l2 == null)
            return l1;
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while(head != null)
        {
            s1.add(head.val);
            head = head.next;
        }
        head = l2;
        
        while(head != null)
        {
            s2.add(head.val);
            head = head.next;
        }
        
        int carry =0;
        //ListNode dummy = new ListNode(0);
        ListNode result = null;
        ListNode new_node;
        
        while(!s1.isEmpty() || !s2.isEmpty() || (carry!=0))
        {
            int sum = (!s1.isEmpty() ? s1.pop() : 0) + (!s2.isEmpty() ? s2.pop() : 0) + carry;
            carry = sum/10;
            new_node = new ListNode(sum%10);
            new_node.next = result;
            result = new_node;
            
        }
        return result;
    }
}