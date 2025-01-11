class Solution {
    public TreeNode constructMaximumBinaryTree(int[]nums) {
         return helper(nums,0,nums.length-1);
    }
    private TreeNode helper(int[] nums,int l,int r){
        if(l>r){
            return null;
        }
        int max=nums[l];
        int maxidx=l;
        for(int i=l+1;i<=r;i++){
            if(max<nums[i]){
                max=nums[i];
                maxidx=i;
            }
        }
         
         TreeNode node=new TreeNode(max);

         node.left=helper(nums,l,maxidx-1);
         node.right=helper(nums,maxidx+1,r);
          return node;
    }
}