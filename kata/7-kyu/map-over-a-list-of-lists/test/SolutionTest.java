import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private static final Integer[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {0, 2, 4}};
  private static final Character[][] chr = {{'h', 'E', 'l', 'l', 'O'}, {'w', 'O', 'r', 'L', 'd'}};

  @Test
  void sample() {
    assertArrayEquals(new Integer[][]{{2, 3, 4, 5}, {6, 7, 8, 9, 10}, {1, 3, 5}}, Solution.gridMap(e -> e + 1, num));
    assertArrayEquals(new Integer[][]{{2, 4, 6, 8}, {10, 12, 14, 16, 18}, {0, 4, 8}}, Solution.gridMap(e -> e * 2, num));
    assertArrayEquals(new Integer[][]{{1, 4, 9, 16}, {25, 36, 49, 64, 81}, {0, 4, 16}}, Solution.gridMap(e -> e * e, num));
    assertArrayEquals(new Character[][]{{'H', 'E', 'L', 'L', 'O'}, {'W', 'O', 'R', 'L', 'D'}}, Solution.gridMap(Character::toUpperCase, chr));
    assertArrayEquals(new Character[][]{{'h', 'e', 'l', 'l', 'o'}, {'w', 'o', 'r', 'l', 'd'}}, Solution.gridMap(Character::toLowerCase, chr));
  }
}