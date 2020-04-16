import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
  @Test
  public void ex1() {
    char[][] hive = new char[][] {
            "bee.bee".toCharArray(),
            ".e..e..".toCharArray(),
            ".b..eeb".toCharArray()
    };
    assertEquals(5, Dinglemouse.howManyBees(hive));
  }

  @Test
  public void ex2() {
    char[][] hive = new char[][] {
            "bee.bee".toCharArray(),
            "e.e.e.e".toCharArray(),
            "eeb.eeb".toCharArray()
    };
    assertEquals(8, Dinglemouse.howManyBees(hive));
  }
}
