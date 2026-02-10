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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ll = new ArrayList<>();
        itrIn(root, ll);
        return ll;
    }

    static void in(TreeNode root, ArrayList<Integer> ll){
        if(root == null) return;
        in(root.left, ll);
        ll.add(root.val);
        in(root.right, ll);
    }

    static void itrIn(TreeNode root, ArrayList<Integer> ll){
        Stack<TreeNode> st = new Stack<>();

        while(root != null || !st.isEmpty()){
            while(root != null){
                st.push(root);
                root = root.left;
            }

            root = st.pop();
            ll.add(root.val);
            root = root.right;
        }
    }
}