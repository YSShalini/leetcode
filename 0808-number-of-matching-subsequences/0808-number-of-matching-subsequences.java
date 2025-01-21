class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String,Integer>map=new HashMap<>();
        for(String c:words){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        char[] inputstring=s.toCharArray();
        for(String e:map.keySet()){
            char[] wordvalue=e.toCharArray();
            int i=0,j=0;
            while(i<inputstring.length&&j<wordvalue.length){
                if(wordvalue[j]==inputstring[i]){
                    i++;
                    j++;
                }else{
                i++;}
            }
            if(j==wordvalue.length){
                ans+=map.get(e);
            }
        }
        return ans;
    }
}