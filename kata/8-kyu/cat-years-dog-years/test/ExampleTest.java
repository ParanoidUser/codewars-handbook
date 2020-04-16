import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTest {

  @Test
  public void one() {
    assertArrayEquals(new int[] {1, 15, 15}, Dinglemouse.humanYearsCatYearsDogYears(1));
  }

  @Test
  public void two() {
    assertArrayEquals(new int[] {2, 24, 24}, Dinglemouse.humanYearsCatYearsDogYears(2));
  }

  @Test
  public void ten() {
    assertArrayEquals(new int[] {10, 56, 64}, Dinglemouse.humanYearsCatYearsDogYears(10));
  }
}
