import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(0, Dinglemouse.howManyBees(null));
    assertEquals(5, Dinglemouse.howManyBees(new char[][]{
        "bee.bee" .toCharArray(),
        ".e..e.." .toCharArray(),
        ".b..eeb" .toCharArray()
    }));

    assertEquals(7, Dinglemouse.howManyBees(new char[][]{
        "beee.." .toCharArray(),
        "eeb.e." .toCharArray(),
        "ebee.b" .toCharArray(),
    }));
    assertEquals(44, Dinglemouse.howManyBees(new char[][]{
        "bbbbbbb".toCharArray(),
        "beebeeb".toCharArray(),
        "beebeeb".toCharArray(),
        "bbbebbb".toCharArray(),
        "beebeeb".toCharArray(),
        "beebeeb".toCharArray(),
        "bbbbbbb".toCharArray()
    }));
  }
}
