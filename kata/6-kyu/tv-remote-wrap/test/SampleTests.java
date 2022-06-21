import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void example() {
    assertEquals(49, Dinglemouse.tvRemote("Code Wars"));
  }

  @Test
  void lower() {
    assertEquals(16, Dinglemouse.tvRemote("does"));
    assertEquals(21, Dinglemouse.tvRemote("your"));
    assertEquals(33, Dinglemouse.tvRemote("solution"));
    assertEquals(18, Dinglemouse.tvRemote("work"));
    assertEquals(12, Dinglemouse.tvRemote("for"));
    assertEquals(27, Dinglemouse.tvRemote("these"));
    assertEquals(23, Dinglemouse.tvRemote("words"));
  }

  @Test
  void upper() {
    assertEquals(19, Dinglemouse.tvRemote("DOES"));
    assertEquals(22, Dinglemouse.tvRemote("YOUR"));
    assertEquals(34, Dinglemouse.tvRemote("SOLUTION"));
    assertEquals(19, Dinglemouse.tvRemote("WORK"));
    assertEquals(15, Dinglemouse.tvRemote("FOR"));
    assertEquals(28, Dinglemouse.tvRemote("THESE"));
    assertEquals(24, Dinglemouse.tvRemote("WORDS"));
  }

  @Test
  void mixed() {
    assertEquals(28, Dinglemouse.tvRemote("Does"));
    assertEquals(33, Dinglemouse.tvRemote("Your"));
    assertEquals(45, Dinglemouse.tvRemote("Solution"));
    assertEquals(26, Dinglemouse.tvRemote("Work"));
    assertEquals(20, Dinglemouse.tvRemote("For"));
    assertEquals(35, Dinglemouse.tvRemote("These"));
    assertEquals(31, Dinglemouse.tvRemote("Words"));
  }
}
