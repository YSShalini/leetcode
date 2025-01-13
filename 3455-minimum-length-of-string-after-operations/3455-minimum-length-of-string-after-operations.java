class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        int c=0;
        for(Integer n:map.values()){
            if(n>=3){
                if(n%2==0){c+=2;}
                else{c+=1;}
            }
            else{
                c+=n;
            }
        }
        return c;
    }
}