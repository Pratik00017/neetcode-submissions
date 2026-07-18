class Solution {

    static class TreeInfo {
        int ht;
        int dia;

        TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }

    public TreeInfo diameter(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int throughRoot = left.ht + right.ht;

        int myDiameter = Math.max(throughRoot,
                           Math.max(left.dia, right.dia));

        return new TreeInfo(myHeight, myDiameter);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }
}