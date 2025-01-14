class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>res=new ArrayList<>();
        Queue<TreeNode>s=new LinkedList<>();
        s.add(root);
        while(!s.isEmpty()){
            int size=s.size();
            double n=0;
            for(int i=0;i<size;i++){
                TreeNode node=s.poll();
                n+=node.val;

                if(node.left!=null)s.add(node.left);
            if(node.right!=null)s.add(node.right);
      
            }
            n=n/size;
            res.add(n);
              }
        return res;
    }
}