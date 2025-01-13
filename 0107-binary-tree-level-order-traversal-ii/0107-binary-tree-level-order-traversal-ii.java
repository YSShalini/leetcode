class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode>s=new LinkedList<>();
        s.add(root);
        while(!s.isEmpty()){
          int size=s.size();
          List<Integer>ans=new ArrayList<>(size);
          for(int i=0;i<size;i++){
          TreeNode node=s.poll();
          ans.add(node.val);
          if(node.left!=null)s.add(node.left);   
          if(node.right!=null)s.add(node.right);   
        }
        res.add(ans);
        }
        Collections.reverse(res);
        return res;
    }
}