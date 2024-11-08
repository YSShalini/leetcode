class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            Boolean f=false;
            while(!st.isEmpty()&&asteroids[i]<0&&st.peek()>0){

                if(st.peek()<Math.abs(asteroids[i])){
                    st.pop();    
                }
                else if(st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                    f=true;
                    break;
                }
                else{
                    f=true;
                    break;
                }
                
            }
            if(!f){
               st.push(asteroids[i]);
                }
            }
            int[] res=new int[st.size()];
            for(int i=res.length-1;i>=0;i--){
                res[i]=st.pop();
            }
            return res;

        }
    }
