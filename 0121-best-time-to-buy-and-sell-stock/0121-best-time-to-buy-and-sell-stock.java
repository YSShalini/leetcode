class Solution {
    public int maxProfit(int[] prices) {
        int pro=0,res=0,min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
           }
          pro=prices[i]-min;
          res=Math.max(res,pro);
        }
        return res;
    }
}