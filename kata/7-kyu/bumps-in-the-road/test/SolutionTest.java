import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTest() {
    assertEquals("Woohoo!", BumpsTheRoad.bumps("n"));
    assertEquals("Car Dead", BumpsTheRoad.bumps("_nnnnnnn_n__n______nn__nn_nnn"));
    assertEquals("Woohoo!", BumpsTheRoad.bumps("______n___n_"));
    assertEquals("Car Dead", BumpsTheRoad.bumps("nnnnnnnnnnnnnnnnnnnnn"));
  }
}
