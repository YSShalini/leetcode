class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res=new int[k][2];
        PriorityQueue<int[]>queue=new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        for(int[] point:points){
            queue.add(point);
        if(queue.size()>k){
            queue.poll();
        }
        }
        for(int i=0;i<k;i++){
            res[i]=queue.poll();
        }
        return res;
    }
}