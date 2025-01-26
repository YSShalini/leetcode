class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]>queue=new PriorityQueue<>((a,b)->a[0]+a[1]-(b[0]+b[1]));
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<Math.min(k,nums1.length);i++){
            queue.add(new int[]{nums1[i],nums2[0],0});
        }
        while(!queue.isEmpty()&&res.size()<k){
            int[]array =queue.poll();
            int a=array[0],b=array[1],idx=array[2];
            res.add(Arrays.asList(a,b));
            if(idx+1<nums2.length){
                queue.add(new int[]{a,nums2[idx+1],idx+1});
            }
        }
        return res;
    }
}