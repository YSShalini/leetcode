class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        List<List<Integer>> res=new ArrayList<>();
        if(heights==null||heights.length==0||heights[0].length==0){
            return res;
        }
        int r=heights.length;
        int c=heights[0].length;
        boolean[][] pacific=new boolean[r][c];
        boolean[][] atlantic=new boolean[r][c];
        for(int i=0;i<r;i++){
            dfs(heights,pacific,i,0,directions);
            dfs(heights,atlantic,i,c-1,directions);
        }
        for(int j=0;j<c;j++){
            dfs(heights,pacific,0,j,directions);
            dfs(heights,atlantic,r-1,j,directions);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pacific[i][j]&&atlantic[i][j]==true){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;

    }

    private void dfs(int[][]heights,boolean[][]ocean,int i,int j,int[][] directions){
        ocean[i][j]=true;

        for(int d[]:directions){
            int nr=i+d[0];
            int nc=j+d[1];

            if(nr>=0&&nc>=0&&nr<heights.length&&nc<heights[0].length&&!ocean[nr][nc]&&heights[nr][nc]>=heights[i][j]){
                dfs(heights,ocean,nr,nc,directions);
            }
        }
    }
}