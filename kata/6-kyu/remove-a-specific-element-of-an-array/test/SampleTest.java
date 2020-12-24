import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{3, -8}}, Kata.selectSubarray(new int[]{1, 23, 2, -8, 5}));
    assertArrayEquals(new int[][]{{2, 23}}, Kata.selectSubarray(new int[]{1, 3, 23, 4, 2, -8, 5, 18}));
    assertArrayEquals(new int[][]{{10, -185}}, Kata.selectSubarray(new int[]{176, -168, -79, -157, 191, 21, -21, 128, 82, 162, -185, 102, -89, 192, 45, -145, -176, -77, 84, 53, -66, 140, -102, 15, -69, 106, 59, -32, -40, 148}));
    assertArrayEquals(new int[][]{{60, 197}}, Kata.selectSubarray(new int[]{-178, -42, -81, 129, 120, 89, -189, 170, 82, -123, -175, 127, 92, 10, 149, 7, -88, 34, -115, -51, -13, 133, 158, 110, 178, 57, -22, 45, -75, -124, 146, -163, 68, -149, -136, -141, 21, -153, 76, -84, -29, 167, -114, -14, -17, 113, -174, 184, -161, 189, -49, 122, 19, -105, 181, -53, 165, 86, -96, 11, 197, -101, 160, -165, -1, -144, -77, 171, -83, -79, -94, -47, -130, 64, -5, -66, 99, -118, 108, -16, -127}));
  }
}