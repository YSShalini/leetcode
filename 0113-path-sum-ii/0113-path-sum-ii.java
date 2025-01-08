
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        helper(root,targetSum,res,current);
        return res;
    }
    private void helper(TreeNode root,int targetSum,List<List<Integer>>res,List<Integer>current){
       
        if(root==null){
            return;
        }
        current.add(root.val);
        if(root.left==null&&root.right==null&&targetSum==root.val){
            res.add(new ArrayList<>(current));
        }
        helper(root.left,targetSum-root.val,res,current);
        helper(root.right,targetSum-root.val,res,current);

        current.remove(current.size()-1);
    }
}