class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int sum=0,i=0;
        com(res,ans,candidates,target,sum,i);
        return res;
    }
    public void com(List<List<Integer>>res,List<Integer>ans,int[] candidates,int target,int sum,int i){
       
        if(sum==target){
            res.add(new ArrayList<>(ans));
            return;
        }
         if(sum>target||i>=candidates.length){
            return ;}

            ans.add(candidates[i]);
            com(res,ans,candidates,target,sum+candidates[i],i);
            ans.remove(ans.size()-1);
            com(res,ans,candidates,target,sum,i+1);
    }
}