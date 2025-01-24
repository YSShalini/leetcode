class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()==0||s==null){return 0;}
       if(s.length()==1){return 1;}
       int l=0,maxlen=0;
       HashSet<Character>set=new HashSet<>();
       for(int r=0;r<s.length();r++){
         while(set.contains(s.charAt(r))){
            set.remove(s.charAt(l));
            l++;
         }
         set.add(s.charAt(r));
         maxlen=Math.max(maxlen,r-l+1);
       }
       return maxlen;
    }

}