class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Boolean>hash=new HashMap<>();
        List<Integer>arr=new ArrayList<>();
        for(int num:nums){
            hash.put(num,true);
        }
        for(int i=1;i<=n;i++){
            if(!hash.containsKey(i)){
                       arr.add(i);
            }
        }
        return arr;
    }
}