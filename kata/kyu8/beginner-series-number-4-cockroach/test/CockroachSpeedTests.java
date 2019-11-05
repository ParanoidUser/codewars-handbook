import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CockroachSpeedTests {
  @Test
  public void basicTests() {
    assertEquals(30, Cockroach.cockroachSpeed(1.08));
    assertEquals(30, Cockroach.cockroachSpeed(1.09));
    assertEquals(0, Cockroach.cockroachSpeed(0));
  }
}
