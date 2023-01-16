import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class DiamondTest {
  @Test
  void sample() {
    assertEquals("""
         *
        ***
         *
        """, Diamond.print(3));
    assertEquals("""
          *
         ***
        *****
         ***
          *
        """, Diamond.print(5));
    assertEquals("*\n", Diamond.print(1));
    assertNull(Diamond.print(0));
    assertNull(Diamond.print(-2));
    assertNull(Diamond.print(2));
  }
}