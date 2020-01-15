import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void basicTests() {
    assertEquals("1,2*2,3", Encoder.compress(new int[] {1, 2, 2, 3}));
    assertEquals("1,3-5,7", Encoder.compress(new int[] {1, 3, 4, 5, 7}));
    assertEquals("1,5-3,7", Encoder.compress(new int[] {1, 5, 4, 3, 7}));
    assertEquals("1,10-6/2,7", Encoder.compress(new int[] {1, 10, 8, 6, 7}));
  }
}
