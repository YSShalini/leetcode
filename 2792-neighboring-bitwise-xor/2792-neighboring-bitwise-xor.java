class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int c=0;
        for(int num:derived){
           c=c^num;
        }
        if(c==0){return true;}
        else{return false;}
    }
}