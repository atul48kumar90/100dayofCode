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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        
        if(root == null)
        {
            return list;
        }
        
        String curr_path = Integer.toString(root.val);
        if(root.left == null && root.right == null)
        {
            list.add(curr_path);
        }
        if(root.left != null)
        {
            dfs(root.left, curr_path, list);
        }
        if(root.right != null)
        {
            dfs(root.right, curr_path, list);
        }
        
        
        
        return list;
    }
    
    public void dfs(TreeNode root, String curr, List<String> list)
    {
        curr += "->" + root.val;
        
        if(root.left == null && root.right == null)
        {
            list.add(curr);
            return;
        }
        if(root.left != null)
        {
            dfs(root.left, curr, list);
        }
        if(root.right != null)
        {
            dfs(root.right, curr, list);
        }
        
    }
}