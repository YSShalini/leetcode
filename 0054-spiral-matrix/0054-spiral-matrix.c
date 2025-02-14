/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    int n=matrixSize;
    int m=matrixColSize[0],k=0;
    int *arr=(int*)malloc(n*m*sizeof(int));
    *returnSize=n*m;
    int t=0,b=n-1,l=0,r=m-1;
    while(l<=r&&t<=b){
        for(int i=l;i<=r;i++){
            arr[k]=matrix[t][i];
            k++;}
            t++;
        
        for(int i=t;i<=b;i++){
            arr[k]=matrix[i][r];
            k++;
        }
         r--;
        if(t<=b){
            for(int i=r;i>=l;i--){
                arr[k]=matrix[b][i];
                k++;
            }
            b--;
        }
        if(l<=r){
            for(int i=b;i>=t;i--){
                arr[k]=matrix[i][l];
                k++;
            }
            l++;
        }
    }
    return arr;
    }
