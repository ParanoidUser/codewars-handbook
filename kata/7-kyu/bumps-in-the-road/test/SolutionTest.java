import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Woohoo!", BumpsTheRoad.bumps("n"));
    assertEquals("Car Dead", BumpsTheRoad.bumps("_nnnnnnn_n__n______nn__nn_nnn"));
    assertEquals("Woohoo!", BumpsTheRoad.bumps("______n___n_"));
    assertEquals("Car Dead", BumpsTheRoad.bumps("nnnnnnnnnnnnnnnnnnnnn"));
  }
}
