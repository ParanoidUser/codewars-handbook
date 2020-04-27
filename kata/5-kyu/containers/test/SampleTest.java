import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(1, Kata.containers("A"));
    assertEquals(3, Kata.containers("CBACBACBACBACBA"));
  }
}
