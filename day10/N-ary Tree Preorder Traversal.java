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
    public List<Integer> preorder(Node root) {
        LinkedList<Node> ll = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        
        if(root == null)
        {
            return res;
        }
        ll.add(root);
        
        while(!ll.isEmpty())
        {
            Node n = ll.pollLast();
            res.add(n.val);
            Collections.reverse(n.children);
            for(Node child : n.children)
                ll.add(child);
        }
        return res;
    }
}