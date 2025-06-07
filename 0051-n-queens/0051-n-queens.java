class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        Set<Integer>col=new HashSet<>();
        Set<Integer>maindiag=new HashSet<>();
        Set<Integer>antidiag=new HashSet<>();
        dfs(res,n,0,new ArrayList<String>(),col,maindiag,antidiag);
        return res;
    }
    void dfs(List<List<String>> res,int n,int start,List<String>str,Set<Integer>col,
    Set<Integer>maindiag,Set<Integer>antidiag){
        if(start==n){
            res.add(new ArrayList<>(str));
            return;
        }
         for(int i=0;i<n;i++){
            if(col.contains(i)||maindiag.contains(start+i)||antidiag.contains(start-i)){
                continue;
            }
            char[]string=new char[n];
            Arrays.fill(string,'.');
            string[i]='Q';
            String ans=new String(string);
            str.add(ans);
            col.add(i);
            maindiag.add(start+i);
            antidiag.add(start-i);
            dfs(res,n,start+1,str,col,maindiag,antidiag);
            str.remove(str.size()-1);
            col.remove(i);
            maindiag.remove(start+i);
            antidiag.remove(start-i);
         } 
    }
}