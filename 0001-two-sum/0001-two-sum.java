class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(map.containsKey(c)){
                arr[0]=i;
                arr[1]=map.get(c);
            }
            else{map.put(nums[i],i);}
        }
        return arr;
    }
}