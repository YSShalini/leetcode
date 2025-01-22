class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,n=nums.length,r=n-1;
        while(l<r){
            nums[l]=nums[l]*nums[l];
            nums[r]=nums[r]*nums[r];
            l++;
            r--; 
        } 
        if(n%2!=0){nums[l]=nums[l]*nums[l];} 
        Arrays.sort(nums);
         return nums;
    }
}