import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class FinanceTest {
  @Test
  void sample() {
    assertEquals(BigInteger.valueOf(105), Finance.finance(5));
    assertEquals(BigInteger.valueOf(168), Finance.finance(6));
    assertEquals(BigInteger.valueOf(360), Finance.finance(8));
    assertEquals(BigInteger.valueOf(2040), Finance.finance(15));
  }
}
