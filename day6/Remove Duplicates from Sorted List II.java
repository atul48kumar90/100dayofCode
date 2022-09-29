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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp = head;
        
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        while(temp != null)
        {
            if(tmap.containsKey(temp.val))
            {
                int t = tmap.get(temp.val)+1;
                tmap.put(temp.val,t);
            }
            else{
                tmap.put(temp.val,1);
            }
            temp = temp.next;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        
        for(Map.Entry<Integer,Integer> m:tmap.entrySet()){
            if(m.getValue()==1)
            {
                curr.next = new ListNode(m.getKey());
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}