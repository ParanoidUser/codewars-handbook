import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Favourites.isFavourite("rose"));
    assertTrue(Favourites.isFavourite("rOsE "));
    assertFalse(Favourites.isFavourite("posy"));
    assertFalse(Favourites.isFavourite("sunflower"));
  }
}