class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer>res=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(int n:nums){
            res.put(n,res.getOrDefault(n,0)+1);
        }
        for(int i:res.keySet()){
            if(res.get(i)>=2){
                ans.add(i);
            }

        }
        return ans;
    }
}