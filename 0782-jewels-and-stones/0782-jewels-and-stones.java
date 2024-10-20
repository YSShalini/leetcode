class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        Map<Character,Integer>m=new HashMap<>();
        for(int i=0;i<jewels.length();i++){
            m.put(jewels.charAt(i),1);
        }
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(m.containsKey(ch)){
            c++;}
        }
        return c;
    }
}