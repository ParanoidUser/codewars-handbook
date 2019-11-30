import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class FuncijTest {

  @Test
  public void test1() {
    assertEquals(BigInteger.valueOf(55), Funcij.sumin(5));
  }

  @Test
  public void test4() {
    assertEquals(BigInteger.valueOf(372), Funcij.sumax(8));
  }

  @Test
  public void test5() {
    assertEquals(BigInteger.valueOf(576), Funcij.sumsum(8));
  }
}
