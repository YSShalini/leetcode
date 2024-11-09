class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> chst=new Stack<>();
        Stack<Integer> cost=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!chst.isEmpty()&&chst.peek()==c){
              cost.push(cost.pop()+1);

              if(cost.peek()==k){
                cost.pop();
                chst.pop();
              }
               }
            else{
                chst.push(c);
                cost.push(1);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!chst.isEmpty()){
            char ch=chst.pop();
            int c=cost.pop();
            for(int i=0;i<c;i++){
               res.append(ch);
            }
        }
        return res.reverse().toString();
        
    }
}