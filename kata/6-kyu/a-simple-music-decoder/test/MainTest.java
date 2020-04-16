import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new int[] {1, 2, 2, 3}, Decoder.uncompress("1,2*2,3"));
    assertArrayEquals(new int[] {1, 3, 4, 5, 7}, Decoder.uncompress("1,3-5,7"));
    assertArrayEquals(new int[] {1, 5, 4, 3, 7}, Decoder.uncompress("1,5-3,7"));
    assertArrayEquals(new int[] {1, 10, 8, 6, 7}, Decoder.uncompress("1,10-6/2,7"));
  }
}
