class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=0,n2=0,c=0;
        for(int num:nums1){
            n1=n1^num;
        }
        for(int nu:nums2){
            n2=n2^nu;
        }
        if((nums1.length%2)!=0){
            c=c^n2;
        }
        if((nums2.length%2)!=0){
            c=c^n1;
        }
        return c;
    }
}