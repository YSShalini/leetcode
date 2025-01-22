class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int t=0,l=0;
        int p=1;
        if(k<=1){return 0;}
        for(int r=0;r<nums.length;r++){
            p*=nums[r];
            while(p>=k){
                p=p/nums[l];
                l++;
            }
            t+=(r-l+1) ;
        }
        return t;
    }
}