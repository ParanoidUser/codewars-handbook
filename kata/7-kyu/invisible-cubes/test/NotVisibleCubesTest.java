import org.junit.Assert;
import org.junit.Test;

public class NotVisibleCubesTest {
  @Test
  public void fixedTest() {
    Assert.assertEquals("should work for 3", NotVisibleCubes.notVisibleCubes(3L), Long.valueOf(1L));
    Assert.assertEquals("should work for 5", NotVisibleCubes.notVisibleCubes(5L), Long.valueOf(27L));
  }
}
