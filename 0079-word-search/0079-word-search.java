class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length,n=board[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean res=backtrack(board,visited,word,i,j,0);
                    if(res) return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(char[][]board,boolean[][]visited,String word,int i,int j,int idx){
          if(idx==word.length()){
            return true;
          }
          if(i<0||i>=board.length||j<0||j>=board[0].length||visited[i][j]||board[i][j]!=word.charAt(idx)){
            return false;
          }
          visited[i][j]=true;
          if(backtrack(board,visited,word,i,j+1,idx+1)||
          backtrack(board,visited,word,i,j-1,idx+1)||
          backtrack(board,visited,word,i+1,j,idx+1)||
          backtrack(board,visited,word,i-1,j,idx+1)){return true;}
          visited[i][j]=false;
          return false;



    }
}