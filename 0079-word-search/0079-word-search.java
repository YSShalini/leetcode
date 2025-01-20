class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        visited=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(word.charAt(0)==board[i][j]&&search(i,j,0,word,board)){
                return true;
               }
            }
        }
        return false;
    }
    public boolean search(int i,int j,int idx,String word,char[][]board){
        if(idx==word.length()){
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[i].length||board[i][j]!=word.charAt(idx)||visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(search(i+1,j,idx+1,word,board)||search(i-1,j,idx+1,word,board)||search(i,j+1,idx+1,word,board)||search(i,j-1,idx+1,word,board)){
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}