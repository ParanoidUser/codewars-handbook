import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class NumberOfRoutesTests {
  @Test
  public void exampleTests() {
    assertEquals(new BigInteger("2"), GridPath.numberOfRoutes(1, 1));
    assertEquals(new BigInteger("6"), GridPath.numberOfRoutes(5, 1));
    assertEquals(new BigInteger("35"), GridPath.numberOfRoutes(3, 4));
  }
}
