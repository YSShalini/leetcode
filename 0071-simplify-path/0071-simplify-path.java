class Solution {
    public String simplifyPath(String path) {
        String [] s=path.split("/");
        Stack<String>st=new Stack<>();
        for(int i=0;i<s.length;i++){
            if(s[i].equals("..")){
                if(!st.isEmpty()){
                st.pop();}
            }
            else if(!s[i].equals("")&&!s[i].equals(".")){
                st.push(s[i]);
            }

        }
       StringBuilder res=new StringBuilder();
       for(String r:st){
        res.append("/").append(r);
       }
       return res.length()==0?"/":res.toString();

    }
}