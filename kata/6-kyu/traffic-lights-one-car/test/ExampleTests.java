import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void example1() {
    assertArrayEquals(new String[] {
          "C...R............G......",
          ".C..R............G......",
          "..C.R............G......",
          "...CR............G......",
          "...CR............G......",
          "....C............O......",
          "....GC...........R......",
          "....G.C..........R......",
          "....G..C.........R......",
          "....G...C........R......",
          "....O....C.......R......"
        }, Dinglemouse.trafficLights("C...R............G......", 10));
  }

  @Test
  public void example2() {
    assertArrayEquals(new String[] {
          "CG...",
          ".C...",
          ".GC..",
          ".G.C.",
          ".G..C",
          ".O...",
        }, Dinglemouse.trafficLights("CG...", 5));
  }
}
