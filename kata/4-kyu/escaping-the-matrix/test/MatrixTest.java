import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MatrixTest {
  @Test
  void sample() {
    assertThrows(Neo.class, Matrix::enter);
  }
}