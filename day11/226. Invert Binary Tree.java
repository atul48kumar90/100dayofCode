 public TreeNode invertTree(TreeNode node) {
        if(node==null){
            return null;
        }
        TreeNode lc = invertTree(node.left);
        TreeNode rc = invertTree(node.right);
        
        node.left = rc;
        node.right = lc;
        return node;
    }