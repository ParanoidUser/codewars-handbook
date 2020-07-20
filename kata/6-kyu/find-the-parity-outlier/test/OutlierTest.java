import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OutlierTest {
  @Test
  void sample() {
    assertEquals(3, FindOutlier.find(new int[]{3, 0, 0}));
    assertEquals(3, FindOutlier.find(new int[]{0, 3, 0}));
    assertEquals(3, FindOutlier.find(new int[]{0, 0, 3}));
    assertEquals(0, FindOutlier.find(new int[]{Integer.MAX_VALUE, 0, 1}));
    assertEquals(206847684, FindOutlier.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
  }
}
