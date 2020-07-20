interface Solution {
  static int maxSum(TreeNode root) {
    return root != null ? Math.max(maxSum(root.left), maxSum(root.right)) + root.value : 0;
  }
}
