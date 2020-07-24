import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class OperarrayTest {
  @Test
  void sample() {
    long[] a = {18, 69, -90, -78, 65, 40};
    assertArrayEquals(new long[]{18, 3, 3, 3, 1, 1}, Operarray.operArray(Operarray::gcdi, a, a[0]));
    assertArrayEquals(new long[]{18, 414, 2070, 26910, 26910, 107640}, Operarray.operArray(Operarray::lcmu, a, a[0]));
    assertArrayEquals(new long[]{18, 87, -3, -81, -16, 24}, Operarray.operArray(Operarray::som, a, 0));
    assertArrayEquals(new long[]{18, 18, -90, -90, -90, -90}, Operarray.operArray(Operarray::mini, a, a[0]));
    assertArrayEquals(new long[]{18, 69, 69, 69, 69, 69}, Operarray.operArray(Operarray::maxi, a, a[0]));
  }
}
