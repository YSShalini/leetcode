class Solution {
    public String frequencySort(String s) {
        StringBuilder ns=new StringBuilder();
        Map<Character,Integer>map=new HashMap<>();
        for(char e:s.toCharArray()){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>maxheap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxheap.addAll(map.entrySet());
        while(!maxheap.isEmpty()){
            Map.Entry<Character,Integer>h=maxheap.poll();
             char c=h.getKey();
             int v=h.getValue();
            for(int j=0;j<v;j++){
              ns.append(c);
            }
        }
        return ns.toString();

    }
}