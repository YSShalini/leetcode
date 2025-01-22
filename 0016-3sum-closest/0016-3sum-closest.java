class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int l,r;
        Arrays.sort(nums);
        int cls=nums[0]+nums[1]+nums[2],cus=0;
        for(int i=0;i<nums.length-2;i++){
            l=i+1;r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
               if(Math.abs(target-sum)<Math.abs(target-cls)){
                cls=sum;
               }
               if(sum>target){r--;}
               else if(sum<target){l++;}
               else{return sum;}
            }
        }
        return cls;
    }
}