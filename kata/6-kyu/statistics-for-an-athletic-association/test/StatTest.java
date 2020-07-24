import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StatTest {
  @Test
  void sample() {
    assertEquals("Range: 00|31|17 Average: 01|28|17 Median: 01|24|57", Stat.stat("01|15|59, 1|47|16, 01|17|20, 1|32|34"));
    assertEquals("Range: 00|31|17 Average: 02|26|05 Median: 02|17|20", Stat.stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17"));
    assertEquals("Range: 00|31|17 Average: 03|25|24 Median: 03|19|40", Stat.stat("03|15|59, 3|47|16, 03|17|20, 3|32|34, 3|17|17, 3|22|00"));
    assertEquals("Range: 00|31|17 Average: 04|26|18 Median: 04|22|00", Stat.stat("04|15|59, 4|47|16, 04|17|20, 4|32|34, 4|17|17, 4|22|00, 4|31|41"));
  }
}
