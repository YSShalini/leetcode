void setZeroes(int** matrix, int matrixSize, int* matrixColSize) {
    int m=matrixSize,n=matrixColSize[0];
    int ra[m],ca[n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                ra[i]=1;
                ca[j]=1;
            }
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(ra[i]==1||ca[j]==1){
                matrix[i][j]=0;
            }
        }
    }
}