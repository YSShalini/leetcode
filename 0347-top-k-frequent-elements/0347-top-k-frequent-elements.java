class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> top=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
           top.put(nums[i],top.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>maxheap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxheap.addAll(top.entrySet());
        int[] res=new int[k];
        
        for(int i=0;i<k;i++){
            res[i]=maxheap.poll().getKey();
        }
        return res;
    }
}