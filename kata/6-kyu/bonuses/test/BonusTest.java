import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BonusTest {
  @Test
  void sample() {
    assertArrayEquals(new long[]{1860, 13640, 2728}, Bonus.bonus(new int[]{22, 3, 15}, 18228));
    assertArrayEquals(new long[]{10241, 5852, 7448}, Bonus.bonus(new int[]{8, 14, 11}, 23541));
    assertArrayEquals(new long[]{13515, 5406, 6360}, Bonus.bonus(new int[]{8, 20, 17}, 25281));
    assertArrayEquals(new long[]{13340, 5336, 3480}, Bonus.bonus(new int[]{6, 15, 23}, 22156));
    assertArrayEquals(new long[]{4608, 3584, 2688}, Bonus.bonus(new int[]{7, 9, 12}, 10880));
    assertArrayEquals(new long[]{13515, 5406, 6360}, Bonus.bonus(new int[]{8, 20, 17}, 25281));
    assertArrayEquals(new long[]{112, 336, 240, 240, 112}, Bonus.bonus(new int[]{30, 10, 14, 14, 30}, 1040));
    assertArrayEquals(new long[]{858, 975, 1430, 975, 975}, Bonus.bonus(new int[] {25, 22, 15, 22, 22}, 5213));
    assertArrayEquals(new long[]{292600, 752400, 277200, 877800, 239400, 478800, 585200, 219450, 585200, 1053360}, Bonus.bonus(new int[]{18, 7, 19, 6, 22, 11, 9, 24, 9, 5}, 5361410));
  }
}

