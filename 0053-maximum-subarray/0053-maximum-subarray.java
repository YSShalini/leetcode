class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,max=nums[0];
        int dp[]=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=nums[i]+Math.max(0,dp[i-1]);
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}