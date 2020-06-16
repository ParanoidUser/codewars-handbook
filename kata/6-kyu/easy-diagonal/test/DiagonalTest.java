import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class DiagonalTest {
  @Test
  void sample() {
    assertEquals(BigInteger.valueOf(5985), Diagonal.diagonal(20, 3));
    assertEquals(BigInteger.valueOf(20349), Diagonal.diagonal(20, 4));
    assertEquals(BigInteger.valueOf(54264), Diagonal.diagonal(20, 5));
  }
}
