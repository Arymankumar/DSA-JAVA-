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
    public boolean isSameTreeHelper(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        } 
        if(p==null && q!=null){
            return false;
        }
        if(p!=null && q==null){
            return false;
        }
        // both p and q are not null
        if(p.val !=q.val){
            return false;

        }
        //  check substree
        boolean sameRightSubtree=isSameTreeHelper(p.right,q.right);
        boolean sameLeftSubtree=isSameTreeHelper(p.left,q.left);
        return sameRightSubtree && sameLeftSubtree;
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        return isSameTreeHelper(p,q);
    }
}