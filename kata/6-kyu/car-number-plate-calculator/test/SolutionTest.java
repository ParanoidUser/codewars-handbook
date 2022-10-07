import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      aaa004, 3
      baa489, 1487
      oba041, 40000
      rba100, 43056
      aja802, 234567
      zzz999, 17558423
      """)
  void sample(String expected, int customerId) {
    assertEquals(expected, Solution.findTheNumberPlate(customerId));
  }
}
