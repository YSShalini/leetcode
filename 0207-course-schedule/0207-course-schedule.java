class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
        for(int j=0;j<numCourses;j++){
            if(dfs(j,visited,graph)){
                return false;
            }
        
        }
        return true;
    }

    private boolean dfs(int j,int[]visited,List<List<Integer>> graph){
        if(visited[j]==1){
            return true;
        }
        if(visited[j]==2){
            return false;
        }
        visited[j]=1;

        for(int nei:graph.get(j)){
            if(dfs(nei,visited,graph)){
                return true;
            }
        }
        visited[j]=2;
        return false;
    }
}