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
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> inordertrav=new ArrayList<>();
        inorder(root, inordertrav);
        HashMap<Integer,Integer> freq=new HashMap<>();
        int maxcnt=0;
        for(int it:inordertrav){
            freq.put(it,freq.getOrDefault(it,0)+1);
            maxcnt=Math.max(maxcnt,freq.get(it));
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(Map.Entry<Integer, Integer> it:freq.entrySet()){
            if(it.getValue()==maxcnt){
                result.add(it.getKey());
            }
        }
        int[] ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
    public static void inorder(TreeNode root, ArrayList<Integer> inordertrav){
        if(root==null){
            return;
        }
        inordertrav.add(root.val);
        inorder(root.left,inordertrav);
        inorder(root.right,inordertrav);
    }
}