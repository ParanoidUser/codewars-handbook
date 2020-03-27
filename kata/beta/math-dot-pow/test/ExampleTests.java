import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void fixedTest1() {
    assertEquals(new BigInteger("-1"), KidMath.pow(new BigInteger("-1"), new BigInteger("-1")));
  }

  @Test
  public void fixedTest2() {
    assertEquals(new BigInteger("-1"), KidMath.pow(BigInteger.TWO, new BigInteger("-1")));
  }

  @Test
  public void fixedTest3() {
    assertEquals(new BigInteger("4"), KidMath.pow(BigInteger.TWO, BigInteger.TWO));
  }

  @Test
  public void fixedTest4() {
    assertEquals(new BigInteger("81"), KidMath.pow(new BigInteger("3"), new BigInteger("3")));
  }
}
