import org.junit.Assert;
import org.junit.Test;

public class SnailTest {
  @Test
  public void snailTest1() {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    Assert.assertArrayEquals(new int[] {1, 2, 3, 6, 9, 8, 7, 4, 5}, Snail.snail(array));
  }
}
