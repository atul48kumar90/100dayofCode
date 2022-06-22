class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<>();
        if (root != null )
        {
            traverse(root, ls);
            
        
        }
        return ls;
    }
        
        public void traverse(TreeNode root, ArrayList<Integer> ls) {
            if(root.left != null) {
                traverse(root.left, ls);
            }
            ls.add(root.val);
            if(root.right != null)
            {
                traverse(root.right, ls);
            }
        }
    
}

