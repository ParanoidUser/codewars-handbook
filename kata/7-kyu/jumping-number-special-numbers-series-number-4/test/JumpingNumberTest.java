import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JumpingNumberTest {
  @Test
  void sample() {
    assertEquals("Jumping!!", Solution.jumpingNumber(9));
    assertEquals("Jumping!!", Solution.jumpingNumber(1));
    assertEquals("Jumping!!", Solution.jumpingNumber(7));
    assertEquals("Jumping!!", Solution.jumpingNumber(23));
    assertEquals("Jumping!!", Solution.jumpingNumber(32));
    assertEquals("Not!!", Solution.jumpingNumber(79));
    assertEquals("Jumping!!", Solution.jumpingNumber(98));
    assertEquals("Jumping!!", Solution.jumpingNumber(8987));
    assertEquals("Jumping!!", Solution.jumpingNumber(4343456));
    assertEquals("Jumping!!", Solution.jumpingNumber(98789876));
  }
}
