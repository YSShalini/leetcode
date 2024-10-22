class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            String d=Integer.toBinaryString(i);
           for(int j=0;j<d.length();j++){
            if(d.substring(j,j+1).equals("1")){
            c++;}
           }
           arr[i]=c;
        }
        return arr;
    }
}