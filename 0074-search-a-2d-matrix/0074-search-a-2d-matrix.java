class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row=matrix.length,col=matrix[0].length;
       int l=0,r=row*col-1;
       while(l<=r){
         int mid=l+(r-l)/2;
         int ro=mid/col;
         int c=mid%col;
         int element=matrix[ro][c];
         if(element<target){l=mid+1;}
         else if(element>target){r=mid-1;}
         else{return true;}
       }
       return false;
    }
}