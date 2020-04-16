class TreeNode {
  static TreeNode leaf(int value) {
    return new TreeNode(value);
  }

  static TreeNode join(int value, TreeNode left, TreeNode right) {
    return new TreeNode(value).withChildren(left, right);
  }

  TreeNode left;
  TreeNode right;
  final int value;

  TreeNode(int value) {
    this.value = value;
  }

  TreeNode withChildren(TreeNode left, TreeNode right) {
    this.left = left;
    this.right = right;
    return this;
  }

  TreeNode withLeaves(int leftValue, int rightValue) {
    return withChildren(leaf(leftValue), leaf(rightValue));
  }
}
