import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class RotationsTest {
  @Test
  void sample() {
    assertTrue(Rotations.containAllRots("", List.of()));
    assertTrue(Rotations.containAllRots("", List.of("bsjq", "qbsj")));
    assertTrue(Rotations.containAllRots("bsjq", List.of("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")));
    assertFalse(Rotations.containAllRots("XjYABhR", List.of("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")));
  }
}
