import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 15, 15}, Dinglemouse.humanYearsCatYearsDogYears(1));
    assertArrayEquals(new int[]{2, 24, 24}, Dinglemouse.humanYearsCatYearsDogYears(2));
    assertArrayEquals(new int[]{10, 56, 64}, Dinglemouse.humanYearsCatYearsDogYears(10));
  }
}
