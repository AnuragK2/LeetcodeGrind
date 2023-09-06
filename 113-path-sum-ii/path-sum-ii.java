/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        solve(root,targetSum,ans,new ArrayList<Integer>());
        return ans;
    }
    public static void solve(TreeNode root,int targetSum,ArrayList<List<Integer>> ans, List<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.val);
        if(root.left==null && root.right==null && targetSum-root.val==0){
            ArrayList<Integer> res=new ArrayList(path);
            ans.add(res);
        }
        solve(root.left,targetSum-root.val,ans,path);
        solve(root.right,targetSum-root.val,ans,path);
        path.remove(path.size()-1);
    }
}