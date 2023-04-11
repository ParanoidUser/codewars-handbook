import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class SumOfKTest {
  @Test
  void sample() {
    assertNull(SumOfK.chooseBestSum(163, 3, List.of(50)));
    assertEquals(163, SumOfK.chooseBestSum(163, 3, List.of(50, 55, 56, 57, 58)));
    assertEquals(178, SumOfK.chooseBestSum(331, 2, List.of(91, 74, 73, 85, 73, 81, 87)));
    assertEquals(228, SumOfK.chooseBestSum(230, 3, List.of(91, 74, 73, 85, 73, 81, 87)));
    assertEquals(230, SumOfK.chooseBestSum(230, 4, List.of(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89)));
    assertEquals(430, SumOfK.chooseBestSum(430, 5, List.of(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89)));
    assertEquals(876, SumOfK.chooseBestSum(880, 8, List.of(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89)));
  }
}