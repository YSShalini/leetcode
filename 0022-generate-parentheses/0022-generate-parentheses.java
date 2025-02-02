class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        StringBuilder ns=new StringBuilder();
        int open=0,close=0;
        gen(open,close,res,ns,n);
        return res;
    }
    public void gen(int o,int c,List<String>res,StringBuilder ns,int n){
        if(ns.length()==2*n){
            res.add(ns.toString());
            return;
        }
        if(o<n){
            ns.append("(");
            gen(o+1,c,res,ns,n);
            ns.deleteCharAt(ns.length()-1); 
        }
        if(c<o){
            ns.append(")");
            gen(o,c+1,res,ns,n);
            ns.deleteCharAt(ns.length()-1); 
        }
    }
}