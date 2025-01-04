/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
         Map<Node,Node>s=new HashMap<>();
        return dfs(node,s);
    }
    private Node dfs(Node node,Map<Node,Node>s){
        if(s.containsKey(node)){
            return s.get(node);
        }
        Node copy=new Node(node.val);
        s.put(node,copy);

        for(Node n:node.neighbors){
            copy.neighbors.add(dfs(n,s));
        }
        return copy;
    }
}