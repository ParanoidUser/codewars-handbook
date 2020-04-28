import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CockroachSpeedTests {
  @Test
  void sample() {
    assertEquals(30, Cockroach.cockroachSpeed(1.08));
    assertEquals(30, Cockroach.cockroachSpeed(1.09));
    assertEquals(0, Cockroach.cockroachSpeed(0));
  }
}
