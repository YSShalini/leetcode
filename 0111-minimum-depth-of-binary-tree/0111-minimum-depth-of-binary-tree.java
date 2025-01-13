class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode>s=new LinkedList<>();
        s.add(root);
        int h=1;
        while(!s.isEmpty()){
            int size=s.size();
            for(int i=0;i<size;i++){
                TreeNode a=s.poll();
                if(a.left==null&&a.right==null){
                    return h;
                }
                if(a.left!=null){
                    s.add(a.left);
                }
                if(a.right!=null){
                    s.add(a.right);
                }
                
            }
            h++;
        }
        return h;
    }
}