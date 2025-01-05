class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            int s=prerequisites[i][0];
            int l=prerequisites[i][1];
            graph.get(l).add(s);
        }
        int[] visited=new int[numCourses];
        ArrayList<Integer> res=new ArrayList<>();
        int[] def=new int[0];
        for(int i=0;i<numCourses;i++){
            if(dfs(i,visited,res,graph)){
               return def;
            }
        }
        Collections.reverse(res);
        int[] ans=res.stream().mapToInt(i -> i).toArray();
        return ans;
    }
    private boolean dfs(int i,int[] visited,ArrayList<Integer> res,List<List<Integer>>graph){
        if(visited[i]==1){
            return true;
        }
        if(visited[i]==2){
            return false;
        }
        visited[i]=1;
        for(int nei:graph.get(i)){
           if(dfs(nei,visited,res,graph)){
            return true;
           }

        }
        visited[i]=2;
        res.add(i);

        return false;
    }
}