import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindMaxValueInTreeTest {
  @Test
  void sample() {
    assertEquals(-1, FindMaxValueInTree.findMax(TreeNode.of(-1)));
    assertEquals(2, FindMaxValueInTree.findMax(TreeNode.of(1).left(2)));
    assertEquals(50, FindMaxValueInTree.findMax(TreeNode.of(6, TreeNode.of(50).left(-100).right(-10), TreeNode.of(40))));
    assertEquals(-10, FindMaxValueInTree.findMax(TreeNode.of(-600, TreeNode.of(-50).left(-100).right(-10), TreeNode.of(-40))));
    assertEquals(50, FindMaxValueInTree.findMax(TreeNode.of(5, TreeNode.of(-22).left(9).right(50), TreeNode.of(11).left(9).right(2))));
  }
}