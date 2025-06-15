import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FinanceTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      7.4, 10215, 24, 20, num_payment 20 c 459 princ 445 int 14 balance 1809
      7.9, 107090, 48, 41, num_payment 41 c 2609 princ 2476 int 133 balance 17794
      6.8, 105097, 36, 4, num_payment 4 c 3235 princ 2685 int 550 balance 94447
      3.8, 48603, 24, 10, num_payment 10 c 2106 princ 2009 int 98 balance 28799
      """)
  void sample(double rate, int bal, int term, int numPayments, String expected) {
    assertEquals(expected, Finance.amort(rate, bal, term, numPayments));
  }
}