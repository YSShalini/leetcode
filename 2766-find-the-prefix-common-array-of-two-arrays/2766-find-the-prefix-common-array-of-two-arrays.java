class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer,Integer>map=new HashMap<>();
        int[] res=new int[A.length];
        int c=0;
        for(int i=0;i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            if(map.get(A[i])==2){
               c++;
            }
            map.put(B[i],map.getOrDefault(B[i],0)+1);
             if(map.get(B[i])==2){
               c++;
            }
            res[i]=c;
        }
        return res;
    }
}