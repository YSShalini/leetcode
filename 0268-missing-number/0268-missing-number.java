class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=nums.length;;
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            if((i ^ k) !=0){ans=i;
            break;}
        }
        return ans;
    }
}