import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RowSumOddNumbersTest {
  @Test
  void sample() {
    assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
    assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
  }
}
