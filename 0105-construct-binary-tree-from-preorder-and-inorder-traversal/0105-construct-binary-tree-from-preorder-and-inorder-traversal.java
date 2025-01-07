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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
       }
       int l=0,r=inorder.length-1,ri=0;
       return helper(preorder,map,ri,l,r);
    }
    private TreeNode helper(int[] preorder,HashMap<Integer,Integer>map,int ri,int l,int r){
        if(l>r){
            return null;
        }
        TreeNode node=new TreeNode(preorder[ri]);
        int mid=map.get(preorder[ri]);
        node.left=helper(preorder,map,ri+1,l,mid-1);
        node.right=helper(preorder,map,ri+mid-l+1,mid+1,r);

        return node;
    }
}