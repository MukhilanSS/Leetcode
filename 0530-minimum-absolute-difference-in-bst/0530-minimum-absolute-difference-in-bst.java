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
    ArrayList<Integer>list;
    public ArrayList<Integer> inorder(TreeNode root)
    {
        if(root==null) return list;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        return list;
    }
    public int getMinimumDifference(TreeNode root) {
        list=new ArrayList<>();
        list=inorder(root);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++)
        {
            min=Math.min(min,list.get(i)-list.get(i-1));
        }
        return min;    
    }
}