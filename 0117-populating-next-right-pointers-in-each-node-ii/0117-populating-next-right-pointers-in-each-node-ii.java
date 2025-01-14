/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node>s=new LinkedList<>();
        s.add(root);
        while(!s.isEmpty()){
            int size=s.size();
            Node prev=null;
            for(int i=0;i<size;i++){
                Node val=s.poll();
                if(prev!=null){
                    prev.next=val;
                }
                prev=val;

                if(val.left!=null)s.add(val.left);
                if(val.right!=null)s.add(val.right);
            }
            prev.next=null;
        }

        return root;
    }
}