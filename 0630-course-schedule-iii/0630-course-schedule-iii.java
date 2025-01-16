class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->Integer.compare(a[1],b[1]));
        PriorityQueue<Integer>maxheap=new PriorityQueue<>((a,b)->b-a);
        int total=0;
        for(int num[]:courses){
            int d=num[0];
            int l=num[1];
            total+=d;
            maxheap.add(d);
            if(total>l){
                total-=maxheap.poll();
            }
    }
        return maxheap.size();
    }
}