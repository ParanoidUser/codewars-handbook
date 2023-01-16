import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(5, Dinglemouse.howManyBees(new char[][]{
        "bee.bee".toCharArray(),
        ".e..e..".toCharArray(),
        ".b..eeb".toCharArray()
    }));

    assertEquals(8, Dinglemouse.howManyBees(new char[][]{
        "bee.bee".toCharArray(),
        "e.e.e.e".toCharArray(),
        "eeb.eeb".toCharArray()
    }));

    assertEquals(0, Dinglemouse.howManyBees(new char[][]{
        "bebebeb".toCharArray(),
        "ebebebe".toCharArray(),
        "bebebeb".toCharArray()
    }));

    assertEquals(0, Dinglemouse.howManyBees(new char[][]{
        ".......".toCharArray(),
        ".......".toCharArray(),
        ".......".toCharArray()
    }));

    assertEquals(0, Dinglemouse.howManyBees(null));
    assertEquals(0, Dinglemouse.howManyBees(new char[0][]));
  }
}