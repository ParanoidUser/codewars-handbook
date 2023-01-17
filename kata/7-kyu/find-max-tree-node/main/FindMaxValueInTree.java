interface FindMaxValueInTree {
  static int findMax(TreeNode root) {
      return root == null ? Integer.MIN_VALUE : Math.max(root.value, Math.max(findMax(root.left), findMax(root.right)));
  }
}