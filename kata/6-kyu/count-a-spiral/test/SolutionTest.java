import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      5, 17
      10, 59
      1000, 500999
      """)
  void sample(BigInteger size, BigInteger whiteBlocks) {
    assertEquals(whiteBlocks, Spiral.sum(size));
  }
}