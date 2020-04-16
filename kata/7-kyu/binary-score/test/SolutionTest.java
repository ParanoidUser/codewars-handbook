import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(new BigInteger("0"), BinaryScore.score(new BigInteger("0")));
    assertEquals(new BigInteger("1"), BinaryScore.score(new BigInteger("1")));
    assertEquals(new BigInteger("63"), BinaryScore.score(new BigInteger("49")));
    assertEquals(new BigInteger("1048575"), BinaryScore.score(new BigInteger("1000000")));
  }
}
