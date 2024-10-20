class Solution {
    public int rotatedDigits(int n) {
         int c=0;
        for(int i=1;i<=n;i++){
             String n1=String.valueOf(i);
            if(good(n1)){
                c++;
            }
        }
        return c;
    }
        public boolean good(String num){
            boolean b=false;
            for(char d1:num.toCharArray()){
            switch(d1){
               case '2':
               case '5':
               case '6':
               case '9':
                    b=true;
                    break;
              case '1':
              case '8':
              case '0':
                break;
            default:
             return false;

            }
            }
            return b;
        }
        
}
        
        
