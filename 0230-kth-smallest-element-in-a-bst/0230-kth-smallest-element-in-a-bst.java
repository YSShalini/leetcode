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
    int c=0,r;
    public int kthSmallest(TreeNode root, int k) {
       pre(root,k);
       return r;
    }
    private void pre(TreeNode root,int k){
        if(root==null){
            return;
        }
        
        pre(root.left,k);
        c++;
        if(c==k){
           r= root.val;
        }
        pre(root.right,k);
    }
}