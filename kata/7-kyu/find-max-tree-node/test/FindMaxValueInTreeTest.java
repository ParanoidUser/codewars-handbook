import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindMaxValueInTreeTest {
  @Test
  void sample() {
    assertEquals(-1, FindMaxValueInTree.findMax(TreeNode.leaf(-1)));
    assertEquals(2, FindMaxValueInTree.findMax(TreeNode.leaf(1).withLeftLeaf(2)));
    assertEquals(50, FindMaxValueInTree.findMax(TreeNode.join(6, TreeNode.leaf(50).withLeaves(-100, -10), TreeNode.leaf(40))));
    assertEquals(-10, FindMaxValueInTree.findMax(TreeNode.join(-600, TreeNode.leaf(-50).withLeaves(-100, -10), TreeNode.leaf(-40))));
    assertEquals(50, FindMaxValueInTree.findMax(TreeNode.join(5, TreeNode.leaf(-22).withLeaves(9, 50), TreeNode.leaf(11).withLeaves(9, 2))));
  }
}
