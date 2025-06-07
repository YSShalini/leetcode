class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>res=new ArrayList<>();
      int n=digits.length();
      if(n==0){return res;}
      String[] arr=new String[19];
      arr[0]="";arr[1]="";arr[2]="abc";arr[3]="def";arr[4]="ghi";arr[5]="jkl";arr[6]="mno";
      arr[7]="pqrs";arr[8]="tuv";arr[9]="wxyz";
      StringBuilder ns=new StringBuilder();
      dfs(res,digits,arr,0,ns);
      return res;
    }
    void dfs(List<String>res,String digits,String[]arr,int start,StringBuilder ns){
          if(start==digits.length()){
            res.add(ns.toString());
            return;
         }
         int num=digits.charAt(start)-'0';
            String ans=arr[num];
         for(int i=0;i<ans.length();i++){  
            ns.append(ans.charAt(i));    
         dfs(res,digits,arr,start+1,ns);
         ns.deleteCharAt(ns.length()-1);
    }
}
}
