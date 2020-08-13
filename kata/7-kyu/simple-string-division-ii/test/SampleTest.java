import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(16, SimpleStringDivision.solve("1 2 36 4 8", 2));
    assertEquals(8, SimpleStringDivision.solve("1 2 36 4 8", 3));
    assertEquals(11, SimpleStringDivision.solve("1 2 36 4 8", 4));
    assertEquals(4, SimpleStringDivision.solve("1 2 36 4 8", 8));
    assertEquals(6, SimpleStringDivision.solve("1 3 6 3", 3));
  }
}
