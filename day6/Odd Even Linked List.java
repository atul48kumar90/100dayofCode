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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        
        int l =0;
        // while(temp != null)
        // {
        //     l++;
        //     temp = temp.next;
        // }
        
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        int j=1;
        while(temp != null)
        {
            if(j%2 == 0)
            {
                even.add(temp.val);
            }
            else
            {
                odd.add(temp.val);
            }
            temp = temp.next;
            j++;
        }
            ListNode dummy = new ListNode(-1);
            ListNode curr = dummy;
            
            for(int i=0;i<odd.size();i++)
            {
                curr.next = new ListNode(odd.get(i));
                curr = curr.next;
            }
            for(int i=0;i<even.size();i++)
            {
                curr.next = new ListNode(even.get(i));
                curr = curr.next;
            }
        return dummy.next;
        
    }
}