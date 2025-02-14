void rotate(int** matrix, int matrixSize, int* matrixColSize) {
    int m=matrixSize;
    for(int i=0;i<m;i++){
        for(int j=i+1;j<m;j++){
             int t=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=t;
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<m/2;j++){
             int t=matrix[i][m-j-1];
             matrix[i][m-j-1]=matrix[i][j];
             matrix[i][j]=t;
        }
    }
}