import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuicksumTest {

  @Test
  public void testQuicksumBasic() {
    assertEquals(46, Quicksum.quicksum("ACM"));
    assertEquals(650, Quicksum.quicksum("MID CENTRAL"));
    assertEquals(15, Quicksum.quicksum("BBC"));
    assertEquals(0, Quicksum.quicksum("???"));
    assertEquals(0, Quicksum.quicksum("axg"));
    assertEquals(0, Quicksum.quicksum("234 234 WEF ASDF AAA 554211 ???? "));
    assertEquals(75, Quicksum.quicksum("A C M"));
  }
}
