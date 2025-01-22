class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
    private String check(String str){
         Stack<Character>st=new Stack<>();
         for(char c:str.toCharArray()){
            if(c=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{st.push(c);}
         }
         StringBuilder f=new StringBuilder();
         while(!st.isEmpty()){
            f.append(st.pop());
         }
         return f.toString();
    }
}