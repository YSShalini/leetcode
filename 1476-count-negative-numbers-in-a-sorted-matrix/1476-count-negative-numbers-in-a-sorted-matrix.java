class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
                int l=0,r=grid[i].length-1;
                while(l<=r){
                    int mid=l+(r-l)/2;
                    if(grid[i][mid]<0){
                        r=mid-1;
                    }
                    else{
                        l=mid+1;
                    }
                }
                c+=grid[i].length-l;
             }
     return c;
    }
}
