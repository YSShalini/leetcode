class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=0;
        for(int p:map.values()){
            if(p>max){max=p;}
        }
        int nc=0;
        for(int c:map.values()){
            if(c==max){nc++;}
        }
        int f=(max-1)*(n+1)+nc;
        return Math.max(f,tasks.length);
    }
}