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
    ListNode help(ListNode head,int s,int e, Map<Integer,ListNode> map){
        
        if(s>e)return null;
        
        ListNode slist=help(head.next,s+1,e-1,map);
        
        ListNode start=map.get(s);
        ListNode end=map.get(e);
        start.next=end;
        end.next=slist;
        return start;
		
    }    
    public void reorderList(ListNode head) {
     
        Map<Integer,ListNode> map=new HashMap<>();//index  maps to Node
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            map.put(i,temp);
            i++;
            temp=temp.next;
        }
        int l=i;//length
        
         help(head,0,l-1,map);
        
           
    }
}