class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer>res=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        for(int n:nums){
         if(!res.add(n)){
            ans.add(n);
         }

        }
        return ans;
    }
}