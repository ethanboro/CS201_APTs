public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t==null) return null;
        TreeNode root = new TreeNode(height(t), rewire(t.left), rewire(t.right));
        return root;

    }
    public int height(TreeNode t) {
        if (t.left==null && t.right==null) return 1;
        else if (t.left==null && t.right!=null) return 1+height(t.right);
        else if (t.left!=null && t.right==null) return 1+height(t.left);
        else return 1+Math.max(height(t.left),height(t.right));
    }
}