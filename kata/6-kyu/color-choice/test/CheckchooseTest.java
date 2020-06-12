import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CheckchooseTest {
  @Test
  void sample() {
    assertEquals(2, Checkchoose.checkchoose(6, 4));
    assertEquals(1, Checkchoose.checkchoose(4, 4));
    assertEquals(3, Checkchoose.checkchoose(35, 7));
    assertEquals(-1, Checkchoose.checkchoose(4, 2));
    assertEquals(-1, Checkchoose.checkchoose(36, 7));
  }
}
