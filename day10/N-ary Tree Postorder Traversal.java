/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        
        if(root == null)
        {
            return res;
        }
        stack.add(root);
        
        while(!stack.isEmpty())
        {
            Node n= stack.pollLast();
            res.add(n.val);
           // Collections.reverse(n.children);
            for(Node child : n.children)
            {
                stack.add(child);
            }
            
        }
        Collections.reverse(res);
        
        return res;
    }
}