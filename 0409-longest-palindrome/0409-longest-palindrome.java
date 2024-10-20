class Solution {
    public int longestPalindrome(String s) {
        int c=0;
        Map<Character,Integer>m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
            
        }
        Boolean hasodd=false;
        for(int freq:m.values()){
            if(freq%2==0){
                c+=freq;
            }
            else{
                c+=freq-1;
                hasodd=true;
            }
        }
        if(hasodd){
        c=c+1;}
        return c;
    }
}