class Solution {
    public int minimizeXor(int num1, int num2) {
        int n1b;
        n1b=Integer.bitCount(num2);
        int num=num1;
        while(Integer.bitCount(num)!=n1b){
            if(Integer.bitCount(num)>n1b){
                num--;
            }
            else{
            num++;}
        }
        return num;

    }
}