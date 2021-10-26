//226. Invert Binary Tree LeetCode

 // Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    TreeNode temp=null;
    public TreeNode invertTree(TreeNode root) 
    {
        if(root==null)
            return null;
        
        findans(root);
        return root;
    }
    public void findans(TreeNode root)
    {
        
        if(root==null)
            return;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        findans(root.left);
        findans(root.right);
    }
}
