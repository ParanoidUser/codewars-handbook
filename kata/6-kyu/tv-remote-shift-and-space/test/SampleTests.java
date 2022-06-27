import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void example() {
    assertEquals(69, Dinglemouse.tvRemote("Code Wars"));
  }

  @Test
  void lower() {
    assertEquals(16, Dinglemouse.tvRemote("does"));
    assertEquals(23, Dinglemouse.tvRemote("your"));
    assertEquals(33, Dinglemouse.tvRemote("solution"));
    assertEquals(20, Dinglemouse.tvRemote("work"));
    assertEquals(12, Dinglemouse.tvRemote("for"));
    assertEquals(27, Dinglemouse.tvRemote("these"));
    assertEquals(25, Dinglemouse.tvRemote("words"));
  }

  @Test
  void upper() {
    assertEquals(27, Dinglemouse.tvRemote("DOES"));
    assertEquals(26, Dinglemouse.tvRemote("YOUR"));
    assertEquals(38, Dinglemouse.tvRemote("SOLUTION"));
    assertEquals(23, Dinglemouse.tvRemote("WORK"));
    assertEquals(21, Dinglemouse.tvRemote("FOR"));
    assertEquals(32, Dinglemouse.tvRemote("THESE"));
    assertEquals(28, Dinglemouse.tvRemote("WORDS"));
  }

  @Test
  void mixed() {
    assertEquals(40, Dinglemouse.tvRemote("Does"));
    assertEquals(37, Dinglemouse.tvRemote("Your"));
    assertEquals(49, Dinglemouse.tvRemote("Solution"));
    assertEquals(30, Dinglemouse.tvRemote("Work"));
    assertEquals(28, Dinglemouse.tvRemote("For"));
    assertEquals(41, Dinglemouse.tvRemote("These"));
    assertEquals(35, Dinglemouse.tvRemote("Words"));
    assertEquals(27, Dinglemouse.tvRemote("qV/YN"));
  }
}
