class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){return -1;}
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int i:bloomDay){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        int ans=high;
        while(low<=high){
             int mid=low+(high-low)/2;
             if(ispossible(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return ans;
    }
    public boolean ispossible(int bloomDay[],int m,int k,int mid){
        int bou=0,flower=0;
        for(int x:bloomDay){
            if(x<=mid){
                flower++;;
                if(flower==k){
                    bou++;
                    flower=0;
                }
            }
            else{
            flower=0;}
            if(bou>=m){return true;}
        }
        return false;
    }
}