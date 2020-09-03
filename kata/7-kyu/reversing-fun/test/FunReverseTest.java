import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FunReverseTest {
  @Test
  void sample() {
    assertEquals("201", FunReverse.funReverse("012"));
    assertEquals("504132", FunReverse.funReverse("012345"));
    assertEquals("9081726354", FunReverse.funReverse("0123456789"));
    assertEquals("oHlel", FunReverse.funReverse("Hello"));
    assertEquals("84rptpzsno51dvmdkjbc59fryj", FunReverse.funReverse("4ppso1vdjc9rjyf5bkmd5nztr8"));
  }
}
