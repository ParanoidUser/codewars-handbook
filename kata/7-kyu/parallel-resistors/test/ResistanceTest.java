import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ResistanceTest {
  @Test
  void sample() {
    assertEquals(10.0, ParallelResistors.resistance(20, 20), 1e-10);
    assertEquals(8.0, ParallelResistors.resistance(20, 20, 40), 1e-10);
  }
}
