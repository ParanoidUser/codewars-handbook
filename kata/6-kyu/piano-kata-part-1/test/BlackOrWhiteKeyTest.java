import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackOrWhiteKeyTest {
  @Test
  public void ExampleTests() {
    assertEquals("white", BlackOrWhiteKey.blackOrWhiteKey(1));
    assertEquals("black", BlackOrWhiteKey.blackOrWhiteKey(5));
    assertEquals("black", BlackOrWhiteKey.blackOrWhiteKey(12));
    assertEquals("white", BlackOrWhiteKey.blackOrWhiteKey(42));
    assertEquals("white", BlackOrWhiteKey.blackOrWhiteKey(88));
    assertEquals("white", BlackOrWhiteKey.blackOrWhiteKey(89));
    assertEquals("white", BlackOrWhiteKey.blackOrWhiteKey(92));
    assertEquals("black", BlackOrWhiteKey.blackOrWhiteKey(100));
    assertEquals("white", BlackOrWhiteKey.blackOrWhiteKey(111));
    assertEquals("black", BlackOrWhiteKey.blackOrWhiteKey(200));
    assertEquals("white", BlackOrWhiteKey.blackOrWhiteKey(2017));
  }
}
