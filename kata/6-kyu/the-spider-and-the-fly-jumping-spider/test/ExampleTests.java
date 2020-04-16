import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void example() {
    assertEquals(4.63522d, Dinglemouse.spiderToFly("H3", "E2"), 1e-3d);
  }

  @Test
  public void same() {
    assertEquals(0d, Dinglemouse.spiderToFly("C2", "C2"), 1e-3d);
    assertEquals(0d, Dinglemouse.spiderToFly("A0", "A0"), 1e-3d);
    assertEquals(0d, Dinglemouse.spiderToFly("F3", "F3"), 1e-3d);
  }

  @Test
  public void radialOut() {
    assertEquals(1d, Dinglemouse.spiderToFly("H1", "H2"), 1e-3d);
    assertEquals(3d, Dinglemouse.spiderToFly("H1", "H4"), 1e-3d);
  }

  @Test
  public void radialThruTheMiddle() {
    assertEquals(8d, Dinglemouse.spiderToFly("G4", "C4"), 1e-3d);
    assertEquals(7d, Dinglemouse.spiderToFly("G4", "C3"), 1e-3d);
  }
}
