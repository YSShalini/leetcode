/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s=new StringBuilder();
        serial(root,s);
        return s.toString();
    }

    private void serial(TreeNode root,StringBuilder s){
        if(root==null){
            s.append("null,");
            return;
        }
        s.append(root.val).append(",");
        serial(root.left,s);
        serial(root.right,s);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        Queue<String> q=new LinkedList<>();
        for(String i: arr ){
            q.add(i);
        }
        return deserial(q);
    }
        private TreeNode deserial(Queue<String>q){
            String v=q.poll();
            if(v.equals("null")){
                return null;
            }
            TreeNode root=new TreeNode(Integer.parseInt(v));
            root.left=deserial(q);
            root.right=deserial(q);
            return root;
        }

    }


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));