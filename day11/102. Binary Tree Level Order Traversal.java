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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)
        {
            return ans;
        }
        q.add(root);
        q.add(null);
        ArrayList<Integer> al = new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode currNode = q.poll();
            if(currNode == null)
            {
                ans.add(al);
                if(q.isEmpty())
                {
                    return ans;
                }
                else{
                    q.add(null);
                    al = new ArrayList<>();
                }
            }
            else
            {
                al.add(currNode.val);
                if(currNode.left != null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right != null)
                {
                    q.add(currNode.right);
                }
            }
            
        }
        return ans;
        
    }
}