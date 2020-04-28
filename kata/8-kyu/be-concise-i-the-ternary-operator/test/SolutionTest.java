import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("You're a(n) kid", C.describeAge(9));
    assertEquals("You're a(n) kid", C.describeAge(10));
    assertEquals("You're a(n) kid", C.describeAge(11));
    assertEquals("You're a(n) kid", C.describeAge(12));
    assertEquals("You're a(n) teenager", C.describeAge(13));
    assertEquals("You're a(n) teenager", C.describeAge(14));
    assertEquals("You're a(n) teenager", C.describeAge(15));
    assertEquals("You're a(n) teenager", C.describeAge(16));
    assertEquals("You're a(n) teenager", C.describeAge(17));
    assertEquals("You're a(n) adult", C.describeAge(18));
    assertEquals("You're a(n) adult", C.describeAge(19));
    assertEquals("You're a(n) adult", C.describeAge(63));
    assertEquals("You're a(n) adult", C.describeAge(64));
    assertEquals("You're a(n) elderly", C.describeAge(65));
    assertEquals("You're a(n) elderly", C.describeAge(66));
    assertEquals("You're a(n) elderly", C.describeAge(100));
  }
}
