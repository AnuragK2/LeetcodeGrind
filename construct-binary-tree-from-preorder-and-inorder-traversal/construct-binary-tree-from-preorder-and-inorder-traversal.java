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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map < Integer, Integer > inmp = new HashMap < Integer, Integer > ();
        for(int i=0;i<inorder.length;i++){
            inmp.put(inorder[i],i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inmp);
        return root;
    }
    public TreeNode buildTree(int[] preorder,int prestart, int preend,int[] inorder, int instart,int inend,Map<Integer,Integer>mp){
        if(prestart>preend || instart>inend)
        return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=mp.get(root.val);
        int numsleft=inroot-instart;
        root.left = buildTree(preorder, prestart + 1, prestart + numsleft, inorder, instart, inroot - 1, mp);
        root.right = buildTree(preorder, prestart + numsleft + 1, preend, inorder, inroot + 1, inend, mp);
        return root;
    }
}