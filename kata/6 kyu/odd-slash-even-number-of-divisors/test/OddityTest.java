import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class OddityTest {
  @Test
  public void exampleTests() {
    assertEquals("odd", Oddity.oddity(BigInteger.valueOf(4)));
    assertEquals("even", Oddity.oddity(BigInteger.valueOf(12)));
    assertEquals("even", Oddity.oddity(BigInteger.valueOf(6437488298980289969L)));
  }
}
