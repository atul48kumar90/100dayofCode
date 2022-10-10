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
    public TreeNode increasingBST(TreeNode root) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        Inorder(root, al);
        return buildTree(al);
    }
    
    public TreeNode buildTree(ArrayList<Integer> al)
    {
        if(al.size() == 0){
            return null;
        }
        TreeNode root = new TreeNode(al.remove(0));
        root.right = buildTree(al);
        return root;
    }
    
    public void Inorder(TreeNode root, ArrayList<Integer> tr)
    {
        if(root == null)
        {
            return;
        }
        Inorder(root.left, tr);
        tr.add(root.val);
        Inorder(root.right, tr);
    }
}