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
    List<Integer> list;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        list=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        while(root!=null || !st.isEmpty())
        {
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            list.add(root.val);
            root=root.right;
        }
        // inorder(root);
        return list;
    }
}