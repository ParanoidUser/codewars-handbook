import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void bounceLeft() {
    char[][] tree = new char[][]{
        " o o o  ".toCharArray(),
        " /    / ".toCharArray(),
        "   /    ".toCharArray(),
        "  /  /  ".toCharArray(),
        "   ||   ".toCharArray(),
        "   ||   ".toCharArray(),
        "   ||   ".toCharArray()
    };
    assertArrayEquals(new int[]{1, 1, 0, 0, 1, 0, 0, 0}, Dinglemouse.shakeTree(tree));
  }

  @Test
  void bounceRight() {
    char[][] tree = new char[][]{
        " o o o  ".toCharArray(),
        " \\    \\ ".toCharArray(),
        "   \\    ".toCharArray(),
        "  \\  \\  ".toCharArray(),
        "   ||   ".toCharArray(),
        "   ||   ".toCharArray(),
        "   ||   ".toCharArray()
    };
    assertArrayEquals(new int[]{0, 0, 0, 1, 1, 0, 1, 0}, Dinglemouse.shakeTree(tree));
  }

  @Test
  void getStuck() {
    char[][] tree = new char[][]{
        " o o o  ".toCharArray(),
        " _      ".toCharArray(),
        "   _ _  ".toCharArray(),
        "   ||   ".toCharArray(),
        "   ||   ".toCharArray(),
        "   ||   ".toCharArray(),
    };
    assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, Dinglemouse.shakeTree(tree));
  }
}