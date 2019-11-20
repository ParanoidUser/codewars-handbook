import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void one() {
    assertArrayEquals(new int[] {1, 1}, Dinglemouse.ownedCatAndDog(15, 15));
  }

  @Test
  public void two() {
    assertArrayEquals(new int[] {2, 2}, Dinglemouse.ownedCatAndDog(24, 24));
  }

  @Test
  public void ten() {
    assertArrayEquals(new int[] {10, 10}, Dinglemouse.ownedCatAndDog(56, 64));
  }
}
