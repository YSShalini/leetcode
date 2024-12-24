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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> current=new ArrayList<>();
            int s=queue.size();
            for(int i=0;i<s;i++){
                TreeNode r=queue.poll();
                current.add(r.val);
                if(r.left!=null){
                    queue.add(r.left);
                }  
                 if(r.right!=null){
                    queue.add(r.right);
                }  
            }
            res.add(current);
        }
        return res;
    }
}