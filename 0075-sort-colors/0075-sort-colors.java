class Solution {
    public void sortColors(int[] nums) {
       int[] count=new int[3];
       for(int n:nums){
        count[n]++;
       }
       int idx=0,pos=0;
       while(pos<=2){
        while(count[pos]>0){
        nums[idx]=pos;
            idx++;
            count[pos]--;
        }
        pos++;
       }
    }
}