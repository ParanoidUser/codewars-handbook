import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(Map.of("Quarters", 3, "Dimes", 1, "Nickels", 1, "Pennies", 1), Change.looseChange(91));
    assertEquals(Map.of("Quarters", 1, "Dimes", 0, "Nickels", 0, "Pennies", 4), Change.looseChange(29));
    assertEquals(Map.of("Quarters", 0, "Dimes", 0, "Nickels", 0, "Pennies", 0), Change.looseChange(0));
    assertEquals(Map.of("Quarters", 0, "Dimes", 0, "Nickels", 0, "Pennies", 0), Change.looseChange(-2));
  }
}