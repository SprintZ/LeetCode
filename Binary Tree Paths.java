/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> array = new ArrayList<String>();
        if(root == null) {
            return array;
        }
        dfs(array, "", root);
        return array;
    }
    public void dfs(ArrayList<String> array, String s, TreeNode root) {
        if(root.left == null && root.right == null) {
            s = s + root.val;
            array.add(s);
            return;
        }
        s = s + root.val + "->";
        if(root.left != null) {
            dfs(array, s, root.left);
        }
         if(root.right != null) {
            dfs(array, s, root.right);
        }
    }
}