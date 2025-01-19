void rotate(int** matrix, int matrixSize, int* matrixColSize) {
    for(int i=0;i<matrixSize;i++){
        for(int j=i+1;j<matrixSize;j++){
            int t=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=t;
        }
    }
    for(int i=0;i<matrixSize;i++){
        for(int j=0;j<matrixSize/2;j++){
            int t=matrix[i][j];
            matrix[i][j]=matrix[i][matrixSize-1-j];
            matrix[i][matrixSize-1-j]=t;
        }
    }
}