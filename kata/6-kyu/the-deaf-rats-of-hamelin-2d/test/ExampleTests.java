import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(1, Dinglemouse.countDeafRats(new char[][]{
        "↗ P     ".toCharArray(),
        "  ↘    ↖".toCharArray(),
        "  ↑     ".toCharArray(),
        "↗       ".toCharArray(),
    }));

    assertEquals(7, Dinglemouse.countDeafRats(new char[][]{
        "        ↗".toCharArray(),
        "P ↓   ↖ ↑".toCharArray(),
        "    ←   ↓".toCharArray(),
        "  ↖ ↙   ↙".toCharArray(),
        "↓ ↓ ↓    ".toCharArray()
    }));

    assertEquals(0, Dinglemouse.countDeafRats(new char[][]{
        "↘ ↓ ↙".toCharArray(),
        "→ P ←".toCharArray(),
        "↗ ↑ ↖".toCharArray()
    }));

    assertEquals(8, Dinglemouse.countDeafRats(new char[][]{
        "↖ ↑ ↗".toCharArray(),
        "← P →".toCharArray(),
        "↙ ↓ ↘".toCharArray()
    }));
  }
}
