class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int[]rowarray=new int[m];
        int[]colarray=new int[n];
        Arrays.fill(rowarray,-1);
        Arrays.fill(colarray,-1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                   rowarray[i]=1;
                   colarray[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rowarray[i]==1||colarray[j]==1){
                    matrix[i][j]=0;
                  
                }
            }
        }
    }
}