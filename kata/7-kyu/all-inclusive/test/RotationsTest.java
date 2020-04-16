import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class RotationsTest {
  @Test
  public void test() {
    assertTrue(Rotations.containAllRots("", List.of()));
    assertTrue(Rotations.containAllRots("", List.of("bsjq", "qbsj")));
    assertTrue(Rotations.containAllRots("bsjq", List.of("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")));
    assertFalse(Rotations.containAllRots("XjYABhR", List.of("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")));
  }
}
