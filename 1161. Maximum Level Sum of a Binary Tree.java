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
    public int maxLevelSum(TreeNode root) {
        ArrayList<Long> arr = new ArrayList<Long>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            for(int i = 0; i<size; i++){
                if(q.peek().left != null)   q.add(q.peek().left);
                if(q.peek().right != null)   q.add(q.peek().right);
                sum += q.poll().val;
            }
            arr.add(sum);
        }
        return (arr.indexOf(Collections.max(arr))+1);
    }
}