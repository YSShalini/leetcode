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
    public int sumNumbers(TreeNode root) {
        int c=0;
        return helper(root,c);
    }
    private int helper(TreeNode root,int c){
        if(root==null){
            return 0;
        }
        c=(c*10)+root.val;
       if(root.left==null&&root.right==null){
        return c;
       }
        int ls=helper(root.left,c);
        
        int rs=helper(root.right,c);
        

         return ls+rs;
    } 
}