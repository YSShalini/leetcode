class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int m=intervals.length;
        List<int[]>list=new ArrayList<>();
        list.add(new int[]{intervals[0][0],intervals[0][1]});
        for(int i=1;i<m;i++){
            int[] a=list.get(list.size()-1);
            if(intervals[i][0]<=a[1]){
                a[1]=Math.max(a[1],intervals[i][1]);
            }
            else{
                list.add(new int[]{intervals[i][0],intervals[i][1]});
        
            }
        }
          return list.toArray(new int[list.size()][]);
    }
}