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
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int count=0;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            int avg=average(cur);
            if(avg==cur.val) count++;
            if(cur.left!=null) q.offer(cur.left);
            if(cur.right!=null) q.offer(cur.right);
        }
        return count;
        
    }
    public int average(TreeNode root){
        int avg=0,sum=0;
        int size=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            size++;
            sum+=node.val;
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null) q.offer(node.right);
        }
        avg=sum/size;
        return avg;
    }
}