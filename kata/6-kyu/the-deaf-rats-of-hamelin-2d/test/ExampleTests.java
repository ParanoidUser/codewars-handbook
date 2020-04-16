import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void ex1() {
    assertEquals(1, Dinglemouse.countDeafRats(new char[][] {
              "↗ P     ".toCharArray(),
              "  ↘    ↖".toCharArray(),
              "  ↑     ".toCharArray(),
              "↗       ".toCharArray(),
            }));
  }

  @Test
  public void ex2() {
    assertEquals(7, Dinglemouse.countDeafRats(new char[][] {
              "        ↗".toCharArray(),
              "P ↓   ↖ ↑".toCharArray(),
              "    ←   ↓".toCharArray(),
              "  ↖ ↙   ↙".toCharArray(),
              "↓ ↓ ↓    ".toCharArray()
            }));
  }

  @Test
  public void ratsComing() {
    assertEquals(0, Dinglemouse.countDeafRats(new char[][] {
              "↘ ↓ ↙".toCharArray(),
              "→ P ←".toCharArray(),
              "↗ ↑ ↖".toCharArray()
            }));
  }

  @Test
  public void ratsGoing() {
    assertEquals(8, Dinglemouse.countDeafRats(new char[][] {
              "↖ ↑ ↗".toCharArray(),
              "← P →".toCharArray(),
              "↙ ↓ ↘".toCharArray()
            }));
  }
}
