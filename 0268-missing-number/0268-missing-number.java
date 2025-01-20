class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int d=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            d-=nums[i];
        }
        return d;
}
}