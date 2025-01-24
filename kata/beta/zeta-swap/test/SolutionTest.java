import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      abcabc, zyxzyx
      aabc, zzbc
      abc, abc
      HeLLo, HeOOo
      123 !@# aabc, 123 !@# zzbc
      """)
  void sample(String suspects, String swapped) {
    assertEquals(swapped, ZetaSwap.swapMurder(suspects));
  }
}