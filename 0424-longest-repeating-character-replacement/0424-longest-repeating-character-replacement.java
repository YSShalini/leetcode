class Solution {
    public int characterReplacement(String s, int k) {
       int[] count=new int[26];
       int l=0,mf=0,ml=0;
       for(int r=0;r<s.length();r++){
        count[s.charAt(r)-'A']++;
        mf=Math.max(mf,count[s.charAt(r)-'A']);
        while((r-l+1)-mf>k){
            count[s.charAt(l)-'A']--;
            l++;
        }
        ml=Math.max(ml,(r-l+1));
       }
       return ml;


    }
}