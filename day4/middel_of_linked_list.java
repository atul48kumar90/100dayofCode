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
    public ListNode middleNode(ListNode head) {
        int i=0;
        int res;
        ListNode temp = head;
        while(head != null)
        {
            i++;
            head=head.next;
        }
        // if(i%2 == 0)
        // {
        //     res = i/2+1;
        // }
        // else{
            res = i/2;
        //}
        while(res != 0)
        {
            temp = temp.next;
            res = res-1;
        }
        return temp;
    }
}