/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max =1;
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        mode(root,map);
        
        int [] ans = new int(map.size();
                             
        int idx=0;
        
        for(Integer key: map.keySet())
        {
            if(map.get(key) == max)
                ans[idx++] = key;
        }
        return Arrays.copyOf(ans , idx);
        
    }
    
    public void mode(TreeNode root, HashMap<Integer, Integer> map)
    {
        if(root == null) return;
        
        if(map.containsKey(root.val))
        {
            int count = map.get(root.val)+1;
            map.put(root.val, count);
            
            max = Math.max(count, max);
        }
        else{
            map.put(root.val,1);
        }
        
        if(root.left != null)
        {
            mode(root.left, map);
        }
        if(root.right != null)
        {
            mode(root.right, map);
        }
    }
}