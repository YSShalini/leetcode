
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>>res=new ArrayList<>();
         if(root==null){
            return res;
         }
          Queue<TreeNode>s=new LinkedList<>();
           s.add(root);
          boolean toggle=true;
           while(!s.isEmpty()){
            int size=s.size();
            List<Integer>ans=new ArrayList<>(size);
            for(int i=0;i<size;i++){
            TreeNode n=s.poll();
            if(toggle){
                ans.add(n.val);
            }
            else{
            ans.add(0,n.val);
            }
            if(n.left!=null){s.add(n.left);}
            if(n.right!=null){s.add(n.right);}
           
            }
            res.add(ans);
            toggle=!toggle;
           }

           return res;
    }
}