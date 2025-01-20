class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==1){
                 c=num;
            }
        }
        return c;
    }
}