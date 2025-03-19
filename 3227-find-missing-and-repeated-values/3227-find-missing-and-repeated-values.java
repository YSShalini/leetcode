class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=grid.length*grid.length,sum=0;
        int t=n*(n+1)/2;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            int a=grid[i][j];
            if(!map.containsKey(a)){
                map.put(a,1);
                sum+=a;
            }
            else{
                 arr[0]=a;
            }
        }
        }
        arr[1]=t-sum;
        return arr;
    }
}