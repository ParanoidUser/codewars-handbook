import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class VampireNumbersTest {
  @Test
  public void testResultArray() {
    assertEquals(List.of(1260, 1395, 1435, 1530, 1827, 2187, 6880), VampireNumbers.searchNumbers(new ArrayList<>()));
  }

  @Test
  public void testNullArray() {
    assertNull(VampireNumbers.searchNumbers(null));
  }
}