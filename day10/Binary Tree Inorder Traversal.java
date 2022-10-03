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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<>();
        
        if(root !=null)
        {
            traverse(root, ls);
        }
        
        return ls;
    }
    public void traverse(TreeNode node, ArrayList<Integer> list)
    {
        if(node.left !=null)
        {
            traverse(node.left, list);
        }
        list.add(node.val);
        if(node.right != null)
        {
            traverse(node.right, list);
        }
    }
}