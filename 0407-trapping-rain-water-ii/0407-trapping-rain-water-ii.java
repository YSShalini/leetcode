class Solution {
    public int trapRainWater(int[][] heightMap) {
        if(heightMap.length==0||heightMap[0].length==0){
            return 0;
        }
        int m=heightMap.length,n=heightMap[0].length;
        boolean[][] visited=new boolean[m][n];
        PriorityQueue<int[]>minheap=new PriorityQueue<>((a,b)->a[2]-b[2]);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==m-1||j==0||j==n-1){
                    minheap.add(new int[]{i,j,heightMap[i][j]});
                    visited[i][j]=true;
                }
            }
        }
        int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};
        int t=0;
        while(!minheap.isEmpty()){
            int[]cell=minheap.poll();
            int i=cell[0],j=cell[1],height=cell[2];
            for(int[] d:direction){
                int ni=i+d[0];
                int nj=j+d[1];

                while(ni>=0&&ni<m&&nj>=0&&nj<n&&!visited[ni][nj]){
                     visited[ni][nj]=true;
                     t+=Math.max( 0, height-heightMap[ni][nj]);
                     minheap.add(new int[]{ni,nj,Math.max(height,heightMap[ni][nj])});
                }
            }
        }
        return t;
    }
}