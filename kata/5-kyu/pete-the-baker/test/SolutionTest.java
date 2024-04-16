import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(2, PeteBaker.cakes(
        Map.of("flour", 500, "sugar", 200, "eggs", 1),
        Map.of("flour", 1200, "sugar", 1200, "eggs", 5, "milk", 200)));

    assertEquals(0, PeteBaker.cakes(
        Map.of("flour", 500, "sugar", 200, "eggs", 1, "cinnamon", 300),
        Map.of("flour", 1200, "sugar", 1200, "eggs", 5, "milk", 200)));
  }
}