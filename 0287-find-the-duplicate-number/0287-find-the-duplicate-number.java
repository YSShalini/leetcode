class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int c=0;
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }
            else{
            c=num;}
        }
        return c;
    }
}