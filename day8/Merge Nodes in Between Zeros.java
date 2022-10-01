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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        
        while(temp != null)
        {
            ListNode curr = temp;
            int sum = 0;
            while(curr.next != null && curr.next.val !=0)
            {
                sum = sum + curr.next.val;
                curr = curr.next;
            }
            al.add(sum);
            temp = curr.next;
            
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        
        for(int i=0;i<al.size()-1;i++)
        {
            ListNode new_node = new ListNode(al.get(i));
            res.next = new_node;
            res = res.next;
        }
        return dummy.next;
    }
}