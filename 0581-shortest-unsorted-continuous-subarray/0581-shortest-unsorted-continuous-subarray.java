class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l=-1,r=-1;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]<max){
                r=i;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            if(nums[i]>min){
                l=i;
            }
        }
        if(l==-1||r==-1){return 0;}
        return r-l+1;
    }
}