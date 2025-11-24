class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int ro=0,col=n-1;
        while(ro<m&&col>=0){
            if(matrix[ro][col]==target){return true;}
            else if(matrix[ro][col]<target){ro++;}
            else{col--;}
        }
        return false;
    }
}