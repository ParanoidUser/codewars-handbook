import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("square", Dinglemouse.nameTheShape(new char[][]{
        "/-------------------\\".toCharArray(),
        "|                   |".toCharArray(),
        "|                   |".toCharArray(),
        "|    ***********    |".toCharArray(),
        "|    *         *    |".toCharArray(),
        "|    *         *    |".toCharArray(),
        "|    *         *    |".toCharArray(),
        "|    *         *    |".toCharArray(),
        "|    *         *    |".toCharArray(),
        "|    ***********    |".toCharArray(),
        "|                   |".toCharArray(),
        "|                   |".toCharArray(),
        "\\-------------------/".toCharArray()
    }));
    assertEquals("diamond", Dinglemouse.nameTheShape(new char[][]{
        "/-------------------\\".toCharArray(),
        "|                   |".toCharArray(),
        "|         *         |".toCharArray(),
        "|        * *        |".toCharArray(),
        "|       *   *       |".toCharArray(),
        "|      *     *      |".toCharArray(),
        "|     *       *     |".toCharArray(),
        "|      *     *      |".toCharArray(),
        "|       *   *       |".toCharArray(),
        "|        * *        |".toCharArray(),
        "|         *         |".toCharArray(),
        "|                   |".toCharArray(),
        "\\-------------------/".toCharArray()
    }));
    assertEquals("circle", Dinglemouse.nameTheShape(new char[][]{
        "/-------------------\\".toCharArray(),
        "|                   |".toCharArray(),
        "|                   |".toCharArray(),
        "|       *****       |".toCharArray(),
        "|     *       *     |".toCharArray(),
        "|    *         *    |".toCharArray(),
        "|    *         *    |".toCharArray(),
        "|    *         *    |".toCharArray(),
        "|     *       *     |".toCharArray(),
        "|       *****       |".toCharArray(),
        "|                   |".toCharArray(),
        "|                   |".toCharArray(),
        "\\-------------------/".toCharArray()
    }));
  }
}
