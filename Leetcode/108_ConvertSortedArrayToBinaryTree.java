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
    public TreeNode sortedArrayToBST(int[] nums) {
        return gs(nums, 0, nums.length-1);
    }
    public TreeNode gs(int[] nums,int left,int right){
        if(left > right) return null;
        int mid = (left + right) / 2;

        TreeNode r = new TreeNode(nums[mid]);
        r.left = gs(nums, left, mid-1);
        r.right = gs(nums, mid+1, right);
        return r;
    }
}
