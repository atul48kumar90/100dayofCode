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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<>();
        if(root != null)
        {
            traverse(root, ls);
        }
        return ls;
    }
    public void traverse(TreeNode root, ArrayList<Integer> ls)
    {
        ls.add(root.val);
        if(root.left != null)
        {
            traverse(root.left, ls);
        }
        if(root.right != null)
        {
            traverse(root.right, ls);
        }
    }
}