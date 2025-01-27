class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length,l=0;
        int[]arr=new int[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 arr[l]=matrix[i][j];
                 l++;   
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}