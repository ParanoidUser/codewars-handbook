import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QuicksumTest {
  @Test
  void sample() {
    assertEquals(46, new Quicksum().quicksum("ACM"));
    assertEquals(650, new Quicksum().quicksum("MID CENTRAL"));
    assertEquals(15, new Quicksum().quicksum("BBC"));
    assertEquals(0, new Quicksum().quicksum("???"));
    assertEquals(0, new Quicksum().quicksum("axg"));
    assertEquals(0, new Quicksum().quicksum("234 234 WEF ASDF AAA 554211 ???? "));
    assertEquals(75, new Quicksum().quicksum("A C M"));
  }
}
