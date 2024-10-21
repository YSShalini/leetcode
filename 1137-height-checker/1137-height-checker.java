class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }
        int c=0;
        Arrays.sort(heights);
        for(int g=0;g<heights.length;g++){
            if(arr[g]!=heights[g])
            c++;
        }
        return c;

        
    }
}