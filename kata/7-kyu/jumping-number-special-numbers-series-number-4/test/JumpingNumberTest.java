import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JumpingNumberTest {
  @Test
  public void single_Digit_Number() {
    assertEquals("Jumping!!", Solution.jumpingNumber(9));
    assertEquals("Jumping!!", Solution.jumpingNumber(1));
    assertEquals("Jumping!!", Solution.jumpingNumber(7));
  }

  @Test
  public void two_Digit_Number() {
    assertEquals("Jumping!!", Solution.jumpingNumber(23));
    assertEquals("Jumping!!", Solution.jumpingNumber(32));
    assertEquals("Not!!", Solution.jumpingNumber(79));
    assertEquals("Jumping!!", Solution.jumpingNumber(98));
  }

  @Test
  public void larger_Numbers() {
    assertEquals("Jumping!!", Solution.jumpingNumber(8987));
    assertEquals("Jumping!!", Solution.jumpingNumber(4343456));
    assertEquals("Jumping!!", Solution.jumpingNumber(98789876));
  }
}
