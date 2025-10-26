class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2,res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>n){res=i;
            break;}
        }
       return res;
    }
}