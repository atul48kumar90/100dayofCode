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
        
        ListNode temp = head;
        ListNode ln = head;
        ListNode rn = head;
        int i=1;
        
        if(head == null)
        {
            return null;
        }
        if( head.next == null)
        {
            return head;
        }
        if(left == right)
        {
            return head;
        }
        while(temp != null)
        {
            if(i==left)
            {
                 ln = temp;
            }
            else if(i == right)
            {
                 rn = temp;
            }
            temp = temp.next;
            i++;
        }
        
        int res = ln.val;
        ln.val = rn.val;
        rn.val = res;
        
        // int j =2;
        // int k = left+1;
        // ListNode temp = head;
        // while(temp != null && j<k)
        // {
        //     temp = temp.next;
        //     j++;
        // }
        // int n = temp.val;
        // temp.val = temp.next.next.val;
        // temp.next.next.val = n;
        
        return head;
    }
}