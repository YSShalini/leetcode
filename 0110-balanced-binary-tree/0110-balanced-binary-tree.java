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
    public boolean isBalanced(TreeNode root) {
        return dfs(root)!=-1;
    }
        private int dfs(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=dfs(root.left);
            int right=dfs(root.right);
            if(Math.abs(left-right)>1 || left==-1 ||right==-1){
                return -1;
            }
            return 1+Math.max(left,right);
        }
    }
