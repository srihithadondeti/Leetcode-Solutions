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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        dfs(root,new StringBuilder(),res);
        return res;
    }
    private void dfs(TreeNode root,StringBuilder sb,List<String> res){
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            res.add(sb.append(root.val).toString());
            return;
        }
        final int length=sb.length();
        dfs(root.left,sb.append(root.val).append("->"),res);
        sb.setLength(length);
        dfs(root.right,sb.append(root.val).append("->"),res);
        sb.setLength(length);
    }
}
