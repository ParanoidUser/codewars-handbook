import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WallyFinderTest {
  @Test
  public void testNegative() {
    assertEquals(-1, WallyFinder.wheresWally(""));
    assertEquals(-1, WallyFinder.wheresWally("DWally"));
    assertEquals(-1, WallyFinder.wheresWally(".Wally"));
    assertEquals(-1, WallyFinder.wheresWally("Wallyd"));
  }

  @Test
  public void testPositive() {
    assertEquals(0, WallyFinder.wheresWally("Wally"));
    assertEquals(8, WallyFinder.wheresWally("Where's Wally"));
    assertEquals(3, WallyFinder.wheresWally("Hi Wally."));
  }
}
