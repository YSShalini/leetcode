int dfs(char** board, int i, int j, char* word,int idx,int n,int m,int* visited){
        if(idx==strlen(word)){
            return 1;
        }
        if(i<0||i>=n||j<0||j>=m||visited[i*m+j]||board[i][j]!=word[idx]){return 0;}

        visited[i*m+j]=1;
        if(dfs(board,i+1,j,word,idx+1,n,m,visited)||dfs(board,i-1,j,word,idx+1,n,m,visited)||dfs(board,i,j-1,word,idx+1,n,m,visited)||dfs(board,i,j+1,word,idx+1,n,m,visited)){
            return 1;
        }
        visited[i*m+j]=0;
        return 0;
    }
    bool exist(char** board, int boardSize, int* boardColSize, char* word) {
    int n=boardSize,m=boardColSize[0];
    int *visited=(int*)calloc(n*m,sizeof(int));
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(board[i][j]==word[0]){
               if(dfs(board,i,j,word,0,n,m,visited)){
                free(visited);
                return 1;
               }
            }
        }
    }
    free(visited);
    return 0;
}
   

