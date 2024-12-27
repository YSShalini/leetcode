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
    
    public int kthSmallest(TreeNode root, int k) {
        int r=0;
       Queue<Integer>s=new LinkedList<>();
       pre(s,root);
       for(int i=0;i<k;i++){
        r=s.poll();
       }
       return r;
    }
    private void pre(Queue s,TreeNode root){
        if(root==null){
            return;
        }
        
        pre(s,root.left);
        s.add(root.val);
        pre(s,root.right);
    }
}