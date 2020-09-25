import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PoetTest {
  @Test
  void sample() {
    assertArrayEquals(new int[] {10, 4, 9}, Poet.pendulum(new int[] {4, 10, 9}));
    assertArrayEquals(new int[] {-3, -7, -6}, Poet.pendulum(new int[] {-3, -6, -7}));
    assertArrayEquals(new int[] {11, -15, 8}, Poet.pendulum(new int[] {-15, 8, 11}));
    assertArrayEquals(new int[] {8, 3, 7, 10}, Poet.pendulum(new int[] {8, 7, 10, 3}));
    assertArrayEquals(new int[] {-1, -10, -1, 8}, Poet.pendulum(new int[] {8, -1, -1, -10}));
    assertArrayEquals(new int[] {-6, -10, -9, -2}, Poet.pendulum(new int[] {-9, -2, -10, -6}));
    assertArrayEquals(new int[] {8, 6, 4, 5, 7}, Poet.pendulum(new int[] {4, 6, 8, 7, 5}));
    assertArrayEquals(new int[] {15, -3, -11, -8, 8}, Poet.pendulum(new int[] {-8, 15, 8, -3, -11}));
    assertArrayEquals(new int[] {-2, -4, -8, -7, -3}, Poet.pendulum(new int[] {-7, -8, -2, -3, -4}));
    assertArrayEquals(new int[] {9, 5, 4, 4, 6, 10}, Poet.pendulum(new int[] {9, 4, 6, 4, 10, 5}));
    assertArrayEquals(new int[] {15, 3, -20, -1, 3, 17}, Poet.pendulum(new int[] {15, 17, 3, -20, -1, 3}));
    assertArrayEquals(new int[] {-8, -9, -10, -10, -8, -3}, Poet.pendulum(new int[] {-8, -8, -9, -10, -10, -3}));
    assertArrayEquals(new int[] {28, 27, 22, 19, 21, 24, 27}, Poet.pendulum(new int[] {27, 27, 19, 21, 22, 28, 24}));
    assertArrayEquals(new int[] {-2, -4, -6, -11, -11, -5, -3}, Poet.pendulum(new int[] {-2, -11, -6, -11, -4, -3, -5}));
    assertArrayEquals(new int[] {15, -8, -10, -19, -13, -8, 7}, Poet.pendulum(new int[] {-8, -13, -19, -8, 7, 15, -10}));
    assertArrayEquals(new int[] {25, 20, 19, 16, 18, 19, 24, 30}, Poet.pendulum(new int[] {20, 19, 25, 16, 19, 30, 18, 24}));
    assertArrayEquals(new int[] {13, 3, -12, -18, -16, -11, 11, 18}, Poet.pendulum(new int[] {11, -16, -18, 13, -11, -12, 3, 18}));
    assertArrayEquals(new int[] {-5, -9, -15, -19, -16, -12, -6, -5}, Poet.pendulum(new int[] {-19, -9, -5, -6, -15, -16, -5, -12}));
    assertArrayEquals(new int[] {18, 10, 4, -5, -20, -10, 2, 7, 15}, Poet.pendulum(new int[] {7, -5, -20, 15, 2, 10, 18, 4, -10}));
    assertArrayEquals(new int[] {19, 12, 2, 1, -10, -6, 1, 12, 13, 19}, Poet.pendulum(new int[] {-6, 1, 2, 12, 19, 12, 19, -10, 13, 1}));
    assertArrayEquals(new int[] {50, 47, 40, 38, 33, 32, 33, 36, 38, 43, 48}, Poet.pendulum(new int[] {33, 38, 38, 36, 43, 48, 32, 40, 47, 50, 33}));
    assertArrayEquals(new int[] {-20, -24, -32, -43, -44, -50, -47, -44, -35, -29, -23, -4}, Poet.pendulum(new int[] {-4, -50, -32, -23, -47, -44, -43, -24, -29, -44, -20, -35}));
    assertArrayEquals(new int[] {50, 48, 44, 41, 38, 37, 32, 35, 37, 38, 42, 46, 49}, Poet.pendulum(new int[] {48, 41, 38, 35, 50, 46, 38, 42, 37, 49, 44, 32, 37}));
  }
}
