class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int np1=m-1,np2=n-1,t=m+n-1;
        while(np1>=0&&np2>=0){
           if(nums1[np1]>nums2[np2]){
            nums1[t]=nums1[np1];
            np1--;
           }
           else{
            nums1[t]=nums2[np2];
            np2--;
           }
           t--;
        }
        while(np2>=0){
            nums1[t]=nums2[np2];
            np2--;
            t--;
        }
    }
}