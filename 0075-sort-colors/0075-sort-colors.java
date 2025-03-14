class Solution {
    public void sortColors(int[] nums) {
        int[]color=new int[3];
        int k=0;
        for(int i:nums){
            color[i]++;
        }
        for(int j=0;j<color.length;j++){
            while(color[j]>0){
                nums[k]=j;
                k++;
                color[j]--;
            }
        }
    }
}