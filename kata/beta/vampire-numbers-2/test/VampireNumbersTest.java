import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class VampireNumbersTest {
  @Test
  void testResultArray() {
    assertEquals(List.of(1260, 1395, 1435, 1530, 1827, 2187, 6880), VampireNumbers.searchNumbers(new ArrayList<>()));
  }

  @Test
  void testNullArray() {
    assertNull(VampireNumbers.searchNumbers(null));
  }
}