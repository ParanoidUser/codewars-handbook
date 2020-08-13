import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertArrayEquals(new String[]{
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

    assertArrayEquals(new String[]{
        "CG...",
        ".C...",
        ".GC..",
        ".G.C.",
        ".G..C",
        ".O...",
    }, Dinglemouse.trafficLights("CG...", 5));
  }
}
