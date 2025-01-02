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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>s=new LinkedList<>();
        List<Integer>res=new ArrayList<>();
        if(root==null){
        return res;}
        s.add(root);
        while(!s.isEmpty()){
            int size=s.size();
            for(int i=0;i<size;i++){
                TreeNode rt=s.poll();
                if(i==size-1){
                    res.add(rt.val);
                }    
                if(rt.left!=null){
                    s.offer(rt.left);
                }
                if(rt.right!=null){
                    s.offer(rt.right);
                }

            }
            
        }
       return res;      
}
}