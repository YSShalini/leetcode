class Solution {
    public int countPalindromicSubsequence(String s) {
        int[]first=new int[26];
        int[]last=new int[26];
        Arrays.fill(first,-1);
        Arrays.fill(last,-1);
        for(int i=0;i<s.length();i++){
            int v=s.charAt(i)-'a';
            if(first[v]==-1){
                first[v]=i;
            }
            last[v]=i;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(first[i]!=-1&&first[i]<last[i]){
             HashSet <Character> res=new HashSet<>();
             for(int j=first[i]+1;j<last[i];j++){
                res.add(s.charAt(j));
             }
             c+=res.size();
            }
        }
    return c;
    }
}