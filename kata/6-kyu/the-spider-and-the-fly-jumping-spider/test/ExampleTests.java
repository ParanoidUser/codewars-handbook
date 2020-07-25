import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(4.63522d, Dinglemouse.spiderToFly("H3", "E2"), 1e-3d);
    assertEquals(0d, Dinglemouse.spiderToFly("C2", "C2"), 1e-3d);
    assertEquals(0d, Dinglemouse.spiderToFly("A0", "A0"), 1e-3d);
    assertEquals(0d, Dinglemouse.spiderToFly("F3", "F3"), 1e-3d);
    assertEquals(1d, Dinglemouse.spiderToFly("H1", "H2"), 1e-3d);
    assertEquals(3d, Dinglemouse.spiderToFly("H1", "H4"), 1e-3d);
    assertEquals(8d, Dinglemouse.spiderToFly("G4", "C4"), 1e-3d);
    assertEquals(7d, Dinglemouse.spiderToFly("G4", "C3"), 1e-3d);
  }
}
