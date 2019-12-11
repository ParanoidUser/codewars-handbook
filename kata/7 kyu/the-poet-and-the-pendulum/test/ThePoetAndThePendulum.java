import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ThePoetAndThePendulum {
  @Test
  public void checkShortLengthPositives() {
    assertArrayEquals(Poet.pendulum(new int[] {4, 10, 9}), new int[] {10, 4, 9});
    assertArrayEquals(Poet.pendulum(new int[] {8, 7, 10, 3}), new int[] {8, 3, 7, 10});
    assertArrayEquals(Poet.pendulum(new int[] {6, 6, 8, 5, 10}), new int[] {10, 6, 5, 6, 8});
    assertArrayEquals(Poet.pendulum(new int[] {9, 4, 6, 4, 10, 5}), new int[] {9, 5, 4, 4, 6, 10});
    assertArrayEquals(Poet.pendulum(new int[] {4, 6, 8, 7, 5}), new int[] {8, 6, 4, 5, 7});
    assertArrayEquals(Poet.pendulum(new int[] {10, 5, 6, 10}), new int[] {10, 5, 6, 10});
    assertArrayEquals(Poet.pendulum(new int[] {11, 12, 12}), new int[] {12, 11, 12});
  }

  @Test
  public void checkMediumLengthPositives() {
    assertArrayEquals(Poet.pendulum(new int[] {27, 27, 19, 21, 22, 28, 24}), new int[] {28, 27, 22, 19, 21, 24, 27});
    assertArrayEquals(Poet.pendulum(new int[] {20, 19, 25, 16, 19, 30, 18, 24}), new int[] {25, 20, 19, 16, 18, 19, 24, 30});
    assertArrayEquals(Poet.pendulum(new int[] {22, 26, 21, 27, 24, 21, 15, 26, 25}), new int[] {27, 26, 24, 21, 15, 21, 22, 25, 26});
    assertArrayEquals(Poet.pendulum(new int[] {19, 30, 16, 19, 28, 26, 28, 17, 21, 17}), new int[] {28, 26, 19, 17, 16, 17, 19, 21, 28, 30});
    assertArrayEquals(Poet.pendulum(new int[] {27, 28, 26, 28, 24, 22, 18, 16, 15, 24}), new int[] {28, 26, 24, 18, 15, 16, 22, 24, 27, 28});
    assertArrayEquals(Poet.pendulum(new int[] {17, 26, 15, 26, 26, 20, 16, 18, 15}), new int[] {26, 26, 18, 16, 15, 15, 17, 20, 26});
    assertArrayEquals(Poet.pendulum(new int[] {22, 21, 19, 27, 18, 15, 24, 24}), new int[] {24, 22, 19, 15, 18, 21, 24, 27});
  }

  @Test
  public void checkLengthyPositives() {
    assertArrayEquals(Poet.pendulum(new int[] {33, 38, 38, 36, 43, 48, 32, 40, 47, 50, 33}), new int[] {50, 47, 40, 38, 33, 32, 33, 36, 38, 43, 48});
    assertArrayEquals(Poet.pendulum(new int[] {49, 40, 41, 41, 39, 43, 40, 46, 30, 47, 46, 40}), new int[] {47, 46, 41, 40, 40, 30, 39, 40, 41, 43, 46, 49});
    assertArrayEquals(Poet.pendulum(new int[] {48, 41, 38, 35, 50, 46, 38, 42, 37, 49, 44, 32, 37}), new int[] {50, 48, 44, 41, 38, 37, 32, 35, 37, 38, 42, 46, 49});
    assertArrayEquals(Poet.pendulum(new int[] {49, 30, 39, 30, 40, 44, 43, 48, 47, 50, 42, 48, 33}), new int[] {50, 48, 47, 43, 40, 33, 30, 30, 39, 42, 44, 48, 49});
    assertArrayEquals(Poet.pendulum(new int[] {48, 43, 35, 47, 39, 38, 38, 46, 49, 32, 42}), new int[] {49, 47, 43, 39, 38, 32, 35, 38, 42, 46, 48});
  }

  @Test
  public void checkShortLengthNegatives() {
    assertArrayEquals(Poet.pendulum(new int[] {-9, -2, -10, -6}), new int[] {-6, -10, -9, -2});
    assertArrayEquals(Poet.pendulum(new int[] {-3, -6, -7}), new int[] {-3, -7, -6});
    assertArrayEquals(Poet.pendulum(new int[] {-7, -8, -2, -3, -4}), new int[] {-2, -4, -8, -7, -3});
    assertArrayEquals(Poet.pendulum(new int[] {-8, -8, -9, -10, -10, -3}), new int[] {-8, -9, -10, -10, -8, -3});
    assertArrayEquals(Poet.pendulum(new int[] {-7, -10, -1, -10, -8}), new int[] {-1, -8, -10, -10, -7});
    assertArrayEquals(Poet.pendulum(new int[] {-6, -2, -5}), new int[] {-2, -6, -5});
  }

  @Test
  public void checkMediumLengthNegatives() {
    assertArrayEquals(Poet.pendulum(new int[] {-2, -11, -6, -11, -4, -3, -5}), new int[] {-2, -4, -6, -11, -11, -5, -3});
    assertArrayEquals(Poet.pendulum(new int[] {-19, -9, -5, -6, -15, -16, -5, -12}), new int[] {-5, -9, -15, -19, -16, -12, -6, -5});
    assertArrayEquals(Poet.pendulum(new int[] {-18, -2, -11, -10, -6, -7, -7, -12, -16}), new int[] {-2, -7, -10, -12, -18, -16, -11, -7, -6});
    assertArrayEquals(Poet.pendulum(new int[] {-10, -10, -12, -13, -5, -10, -4, -17, -5, -12}), new int[] {-5, -10, -10, -12, -17, -13, -12, -10, -5, -4});
  }

  @Test
  public void checkLengthyNegatives() {
    assertArrayEquals(Poet.pendulum(new int[] {-33, -21, -6, -29, -24, -5, -50, -42, -43, -17, -17}), new int[] {-5, -17, -21, -29, -42, -50, -43, -33, -24, -17, -6});
    assertArrayEquals(Poet.pendulum(new int[] {-4, -50, -32, -23, -47, -44, -43, -24, -29, -44, -20, -35}), new int[] {-20, -24, -32, -43, -44, -50, -47, -44, -35, -29, -23, -4});
    assertArrayEquals(Poet.pendulum(new int[] {-36, -38, -44, -47, -41, -27, -10, -30, -22, -11, -23, -50, -23}), new int[] {-10, -22, -23, -30, -38, -44, -50, -47, -41, -36, -27, -23, -11});
  }

  @Test
  public void checkMixtureOfPositivesAndNegatives() {
    assertArrayEquals(Poet.pendulum(new int[] {-15, 8, 11}), new int[] {11, -15, 8});
    assertArrayEquals(Poet.pendulum(new int[] {8, -1, -1, -10}), new int[] {-1, -10, -1, 8});
    assertArrayEquals(Poet.pendulum(new int[] {-8, 15, 8, -3, -11}), new int[] {15, -3, -11, -8, 8});
    assertArrayEquals(Poet.pendulum(new int[] {15, 17, 3, -20, -1, 3}), new int[] {15, 3, -20, -1, 3, 17});
    assertArrayEquals(Poet.pendulum(new int[] {-8, -13, -19, -8, 7, 15, -10}), new int[] {15, -8, -10, -19, -13, -8, 7});
    assertArrayEquals(Poet.pendulum(new int[] {11, -16, -18, 13, -11, -12, 3, 18}), new int[] {13, 3, -12, -18, -16, -11, 11, 18});
    assertArrayEquals(Poet.pendulum(new int[] {7, -5, -20, 15, 2, 10, 18, 4, -10}), new int[] {18, 10, 4, -5, -20, -10, 2, 7, 15});
    assertArrayEquals(Poet.pendulum(new int[] {-6, 1, 2, 12, 19, 12, 19, -10, 13, 1}), new int[] {19, 12, 2, 1, -10, -6, 1, 12, 13, 19});
  }
}
