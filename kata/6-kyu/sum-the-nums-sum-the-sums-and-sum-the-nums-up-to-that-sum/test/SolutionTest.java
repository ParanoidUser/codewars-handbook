import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(new BigInteger("55"), Solution.sumOfSums(3));
    assertEquals(new BigInteger("630"), Solution.sumOfSums(5));
    assertEquals(new BigInteger("14740530850"), Solution.sumOfSums(100));
  }
}