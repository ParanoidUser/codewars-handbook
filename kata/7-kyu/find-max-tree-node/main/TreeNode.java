import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
class TreeNode {
  final int value;
  TreeNode left;
  TreeNode right;

  public static TreeNode of(int i) {
    return of(i, null, null);
  }

  public static TreeNode of(int i, TreeNode left, TreeNode right) {
    return new TreeNode(i, left, right);
  }

  public TreeNode left(int value) {
    this.left = of(value);
    return this;
  }

  public TreeNode right(int value) {
    this.right = of(value);
    return this;
  }
}