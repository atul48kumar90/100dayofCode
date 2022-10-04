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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> temp = new LinkedList<>();
        temp.add(root);
        temp.add(null);
        List<Integer> sublist = new ArrayList<>();
        while(!temp.isEmpty()){
            TreeNode front = temp.poll();
            if(front==null){
                list.add(sublist);
                if(temp.isEmpty()){
                    break;
                }
                temp.add(null);
                sublist = new ArrayList();
            }
            else{
                sublist.add(front.val);
                if(front.left!=null)
                    temp.add(front.left);
                if(front.right!=null)
                    temp.add(front.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}