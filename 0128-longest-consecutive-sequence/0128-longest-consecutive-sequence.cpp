class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n=nums.size();
        if(n==0)return 0;
        sort(nums.begin(),nums.end());
        int maxl=0,cur=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1)
            cur++;
            else if(nums[i]!=nums[i-1]){
            maxl=max(maxl,cur);
            cur=1;}
        }
        maxl=max(maxl,cur);
        return maxl;


    }
};