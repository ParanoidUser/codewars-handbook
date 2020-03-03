import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void maxSumInNullTree() {
    assertThat(Solution.maxSum(null), is(0));
  }

  @Test
  public void maxSumInPerfectTree() {
    TreeNode left = TreeNode.leaf(-22).withLeaves(9, 50);
    TreeNode right = TreeNode.leaf(11).withLeaves(9, 2);
    TreeNode root = TreeNode.join(5, left, right);
    assertThat(Solution.maxSum(root), is(33));
  }
}
