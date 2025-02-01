class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>s=new ArrayList<>();
        StringBuilder ns=new StringBuilder();
        if(digits.length()==0){return s;}
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(0,digits,map,s,ns);
        return s;

        }
    public void backtrack(int idx,String digits,String[] map,List<String>s,StringBuilder ns){
        if(idx==digits.length()){
            s.add(ns.toString());
            return;
        }
        String l=map[digits.charAt(idx)-'0'];
        for(char c:l.toCharArray()){
            ns.append(c);
            backtrack(idx+1,digits,map,s,ns);
            ns.deleteCharAt(ns.length()-1);
        }
        
    }
    }
