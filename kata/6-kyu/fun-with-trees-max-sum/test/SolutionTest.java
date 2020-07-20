import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    TreeNode left = TreeNode.leaf(-22).withLeaves(9, 50);
    TreeNode right = TreeNode.leaf(11).withLeaves(9, 2);
    TreeNode root = TreeNode.join(5, left, right);
    assertEquals(33, Solution.maxSum(root));
    assertEquals(0, Solution.maxSum(null));
  }
}
