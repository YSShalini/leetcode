class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;
        int l=0,ri=r*c-1;
        while(l<=ri){
            int mid=l+(ri-l)/2;
            int midv=matrix[mid/c][mid%c];
            if(midv==target){
                return true;
            }
            else if(midv<target){
                l=mid+1;
            }
            else {
                ri=mid-1;
            }
        }
        return false;
    }
}