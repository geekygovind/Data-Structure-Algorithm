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
    private void search(TreeNode root, String p, List<String> ans){
        if(root.left == null && root.right == null) ans.add(p + root.val);
        if(root.left != null) search(root.left, p + root.val + "->" , ans);
        if(root.right != null) search(root.right, p + root.val + "->", ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root != null) search(root, "", ans);
        return ans;
    }
}
