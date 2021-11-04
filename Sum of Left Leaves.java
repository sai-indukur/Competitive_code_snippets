//404. Sum of Left Leaves LeetCode
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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) 
    {
       
       findleftsum(root);
       return sum;
    }
    public void findleftsum(TreeNode root)
    {
        if(root==null)
            return;
      if(isleaf(root.left))
      {
          sum+=root.left.val;
      }
      findleftsum(root.left);
      findleftsum(root.right);
    }
    public boolean isleaf(TreeNode root1)
    {
        if(root1==null)
            return false;
        else if(root1.left==null && root1.right==null)
            return true;
        return false;
    }
}
