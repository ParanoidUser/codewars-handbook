import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(new BigInteger("0"), BinaryScore.score(new BigInteger("0")));
    assertEquals(new BigInteger("1"), BinaryScore.score(new BigInteger("1")));
    assertEquals(new BigInteger("63"), BinaryScore.score(new BigInteger("49")));
    assertEquals(new BigInteger("1048575"), BinaryScore.score(new BigInteger("1000000")));
  }
}
