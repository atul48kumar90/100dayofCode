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
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        
        while(temp != null)
        {
            al.add(temp.val);
            temp = temp.next;
        }
        int i = al.size() - 1;
        
        while(head != null)
        {
            if(head.val != al.get(i))
            {
                return false;
            }
            else{
                head = head.next;
                i--;
            }
        }
        return true;
//         ListNode temp = head;
//         String str = "";
//         while(temp != null)
//         {
//             str.concat((temp.val)+"");
//             temp = temp.next;
//         }
        
//         StringBuilder str1 = new StringBuilder(str);
//         //System.out.println(str);
        
//         if(str1.equals(str1.reverse()))
//         {
//             return true;
//         }
//         else{
//             return false;
//         }
    }
}