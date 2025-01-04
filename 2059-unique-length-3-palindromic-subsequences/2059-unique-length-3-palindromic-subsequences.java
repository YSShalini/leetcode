class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,List<Integer>>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                if(s.indexOf(c)!=s.lastIndexOf(c)){
                map.put(c,Arrays.asList(s.indexOf(c),s.lastIndexOf(c)));
                }
            }
        }
        HashSet <String> res=new HashSet<>();
        for(char c:map.keySet()){
           List<Integer>index=map.get(c);
           int start=index.get(0);
           int last=index.get(1);
           for(int i=start+1;i<last;i++){
            res.add(""+c+s.charAt(i)+c);
        }
        
    }
    return res.size();
    }
}