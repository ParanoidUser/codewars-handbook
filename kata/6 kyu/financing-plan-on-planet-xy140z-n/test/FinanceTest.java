import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class FinanceTest {
  @Test
  public void test1() {
    assertEquals(BigInteger.valueOf(105), Finance.finance(5));
  }

  @Test
  public void test2() {
    assertEquals(BigInteger.valueOf(168), Finance.finance(6));
  }

  @Test
  public void test3() {
    assertEquals(BigInteger.valueOf(360), Finance.finance(8));
  }

  @Test
  public void test4() {
    assertEquals(BigInteger.valueOf(2040), Finance.finance(15));
  }
}
