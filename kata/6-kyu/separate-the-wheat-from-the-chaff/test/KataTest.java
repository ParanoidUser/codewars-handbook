import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void checkShortLengthVectors() {
    assertArrayEquals(new long[] {-6, -4, 6, 2}, Kata.wheatFromChaff(new long[] {2, -4, 6, -6}));
    assertArrayEquals(new long[] {-10, -3, 7}, Kata.wheatFromChaff(new long[] {7, -3, -10}));
    assertArrayEquals(new long[] {-2, -8, 1, 7}, Kata.wheatFromChaff(new long[] {7, -8, 1, -2}));
    assertArrayEquals(new long[] {-7, -6, 10, 8, 9}, Kata.wheatFromChaff(new long[] {8, 10, -6, -7, 9}));
    assertArrayEquals(new long[] {-3, -6, -10, 2, 4}, Kata.wheatFromChaff(new long[] {-3, 4, -10, 2, -6}));
    assertArrayEquals(new long[] {-2, -6, -4, -8, 1, 2}, Kata.wheatFromChaff(new long[] {2, -6, -4, 1, -8, -2}));
  }

  @Test
  void checkMediumLengthVectors() {
    assertArrayEquals(new long[] {-2, -37, -48, -47, 25, 41, 16}, Kata.wheatFromChaff(new long[] {16, 25, -48, -47, -37, 41, -2}));
    assertArrayEquals(new long[] {-30, -11, -50, -5, 34, 38, 36}, Kata.wheatFromChaff(new long[] {-30, -11, 36, 38, 34, -5, -50}));
    assertArrayEquals(new long[] {-31, -5, -28, -42, -22, -46, -4, 11}, Kata.wheatFromChaff(new long[] {-31, -5, 11, -42, -22, -46, -4, -28}));
    assertArrayEquals(new long[] {-32, -17, -45, -2, -5, -6, 39, 46, 17}, Kata.wheatFromChaff(new long[] {46, 39, -45, -2, -5, -6, -17, -32, 17}));
    assertArrayEquals(new long[] {-9, -8, -6, -46, -19, 1, 44}, Kata.wheatFromChaff(new long[] {-9, -8, -6, -46, 1, -19, 44}));
    assertArrayEquals(new long[] {-37, -10, -42, -45, -31, -40, 19, 33}, Kata.wheatFromChaff(new long[] {-37, -10, -42, 19, -31, -40, -45, 33}));
    assertArrayEquals(new long[] {-25, -48, -29, -25, -46, -19, -32, 49, 1, 1}, Kata.wheatFromChaff(new long[] {-25, -48, -29, -25, 1, 49, -32, -19, -46, 1}));
  }

  @Test
  void checkLengthyVectors() {
    assertArrayEquals(new long[] {-7, -35, -46, -22, -26, -5, -44, -14, 34, 43, 46}, Kata.wheatFromChaff(new long[] {-7, -35, -46, -22, 46, 43, -44, -14, 34, -5, -26}));
    assertArrayEquals(new long[] {-46, -50, -28, -45, -27, -40, -24, -46, 34, 47, 35, 10}, Kata.wheatFromChaff(new long[] {-46, -50, -28, -45, -27, -40, 10, 35, 34, 47, -46, -24}));
    assertArrayEquals(new long[] {-33, -14, -19, -45, -12, -21, -10, -3, 41, 4, 31, 41, 16}, Kata.wheatFromChaff(new long[] {-33, -14, 16, 31, 4, 41, -10, -3, -21, -12, -45, 41, -19}));
    assertArrayEquals(new long[] {-17, -45, -12, -29, -24, -8, -19, 4, 40, 31, 10, 21, 7, 1}, Kata.wheatFromChaff(new long[] {-17, 7, -12, 10, 4, -8, -19, -24, 40, 31, -29, 21, -45, 1}));
    assertArrayEquals(new long[] {-16, -27, -7, -31, -34, -43, -44, -18, -24, -46, 39, 50, 3, 9, 44}, Kata.wheatFromChaff(new long[] {-16, 44, -7, -31, 9, -43, -44, -18, 50, 39, -46, -24, 3, -34, -27}));
  }

  @Test
  void checkEdgeNegatives() {
    assertArrayEquals(new long[] {-22, -20, -32}, Kata.wheatFromChaff(new long[] {-22, -20, -32}));
    assertArrayEquals(new long[] {-46, -3, -15, -5}, Kata.wheatFromChaff(new long[] {-46, -3, -15, -5}));
    assertArrayEquals(new long[] {-46, -17, -48, -5, -21}, Kata.wheatFromChaff(new long[] {-46, -17, -48, -5, -21}));
    assertArrayEquals(new long[] {-38, -46, -19, -50, -3, -6}, Kata.wheatFromChaff(new long[] {-38, -46, -19, -50, -3, -6}));
    assertArrayEquals(new long[] {-43, -39, -3, -48, -26, -8, -11}, Kata.wheatFromChaff(new long[] {-43, -39, -3, -48, -26, -8, -11}));
    assertArrayEquals(new long[] {-16, -3, -26, -33, -3, -31, -6, -14}, Kata.wheatFromChaff(new long[] {-16, -3, -26, -33, -3, -31, -6, -14}));
    assertArrayEquals(new long[] {-45, -40, -22, -4, -39, -50, -20, -20}, Kata.wheatFromChaff(new long[] {-45, -40, -22, -4, -39, -50, -20, -20}));
    assertArrayEquals(new long[] {-47, -10, -21, -16, -9, -10, -12, -35, -12, -44}, Kata.wheatFromChaff(new long[] {-47, -10, -21, -16, -9, -10, -12, -35, -12, -44}));
    assertArrayEquals(new long[] {-14, -5, -10, -39, -15, -12, -50, -3, -34, -15, -48}, Kata.wheatFromChaff(new long[] {-14, -5, -10, -39, -15, -12, -50, -3, -34, -15, -48}));
    assertArrayEquals(new long[] {-20, -30, -26, -14, -15, -30, -44, -38, -35, -38, -10, -44}, Kata.wheatFromChaff(new long[] {-20, -30, -26, -14, -15, -30, -44, -38, -35, -38, -10, -44}));
    assertArrayEquals(new long[] {-15, -45, -23, -2, -35, -37, -24, -13, -19, -6, -26, -11, -34}, Kata.wheatFromChaff(new long[] {-15, -45, -23, -2, -35, -37, -24, -13, -19, -6, -26, -11, -34}));
  }

  @Test
  void checkEdgePositives() {
    assertArrayEquals(new long[] {9, 9, 20}, Kata.wheatFromChaff(new long[] {9, 9, 20}));
    assertArrayEquals(new long[] {34, 17, 37, 45}, Kata.wheatFromChaff(new long[] {34, 17, 37, 45}));
    assertArrayEquals(new long[] {18, 9, 27, 45, 35}, Kata.wheatFromChaff(new long[] {18, 9, 27, 45, 35}));
    assertArrayEquals(new long[] {3, 6, 24, 46, 42, 18}, Kata.wheatFromChaff(new long[] {3, 6, 24, 46, 42, 18}));
    assertArrayEquals(new long[] {22, 43, 50, 38, 33, 1, 36}, Kata.wheatFromChaff(new long[] {22, 43, 50, 38, 33, 1, 36}));
    assertArrayEquals(new long[] {2, 34, 48, 19, 20, 16, 5, 45}, Kata.wheatFromChaff(new long[] {2, 34, 48, 19, 20, 16, 5, 45}));
    assertArrayEquals(new long[] {50, 16, 39, 11, 16, 50, 6, 36, 25}, Kata.wheatFromChaff(new long[] {50, 16, 39, 11, 16, 50, 6, 36, 25}));
    assertArrayEquals(new long[] {21, 22, 9, 3, 7, 26, 13, 26, 25, 15}, Kata.wheatFromChaff(new long[] {21, 22, 9, 3, 7, 26, 13, 26, 25, 15}));
    assertArrayEquals(new long[] {31, 22, 24, 25, 17, 12, 11, 14, 38, 15, 22}, Kata.wheatFromChaff(new long[] {31, 22, 24, 25, 17, 12, 11, 14, 38, 15, 22}));
    assertArrayEquals(new long[] {24, 4, 48, 15, 25, 5, 5, 10, 32, 37, 37, 11}, Kata.wheatFromChaff(new long[] {24, 4, 48, 15, 25, 5, 5, 10, 32, 37, 37, 11}));
    assertArrayEquals(new long[] {49, 10, 5, 40, 26, 17, 25, 24, 30, 34, 13, 36, 21}, Kata.wheatFromChaff(new long[] {49, 10, 5, 40, 26, 17, 25, 24, 30, 34, 13, 36, 21}));
    assertArrayEquals(new long[] {28, 44, 44, 41, 24, 50, 28, 27, 50, 1, 25, 34, 11, 45}, Kata.wheatFromChaff(new long[] {28, 44, 44, 41, 24, 50, 28, 27, 50, 1, 25, 34, 11, 45}));
  }
}
