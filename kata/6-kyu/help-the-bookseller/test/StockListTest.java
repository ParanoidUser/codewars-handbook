import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StockListTest {
  @Test
  void sample() {
    assertEquals("(A : 200) - (B : 1140)", StockList.stockSummary(new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[]{"A", "B"}));
    assertEquals("", StockList.stockSummary(new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[0]));
    assertEquals("", StockList.stockSummary(new String[0], new String[]{"A", "B"}));
  }
}
