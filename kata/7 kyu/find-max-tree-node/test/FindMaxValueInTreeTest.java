import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class FindMaxValueInTreeTest {
  @Test
  public void findMaxInLeaf() {
    TreeNode root = TreeNode.leaf(-1);
    assertThat(FindMaxValueInTree.findMax(root), is(-1));
  }

  @Test
  public void findMaxInOneChildTree() {
    TreeNode root = TreeNode.leaf(1).withLeftLeaf(2);
    assertThat(FindMaxValueInTree.findMax(root), is(2));
  }

  @Test
  public void findMaxInPerfectTree() {
    TreeNode left = TreeNode.leaf(-22).withLeaves(9, 50);
    TreeNode right = TreeNode.leaf(11).withLeaves(9, 2);
    TreeNode root = TreeNode.join(5, left, right);
    assertThat(FindMaxValueInTree.findMax(root), is(50));
  }

  @Test
  public void findMaxInUnbalancedTree() {
    TreeNode left = TreeNode.leaf(50).withLeaves(-100, -10);
    TreeNode right = TreeNode.leaf(40);
    TreeNode root = TreeNode.join(6, left, right);
    assertThat(FindMaxValueInTree.findMax(root), is(50));
  }

  @Test
  public void findMaxInNegativeTree() {
    TreeNode left = TreeNode.leaf(-50).withLeaves(-100, -10);
    TreeNode right = TreeNode.leaf(-40);
    TreeNode root = TreeNode.join(-600, left, right);
    assertThat(FindMaxValueInTree.findMax(root), is(-10));
  }
}
