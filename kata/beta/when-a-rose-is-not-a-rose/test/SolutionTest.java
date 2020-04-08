import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertTrue(Favourites.isFavourite("rose"));
    assertTrue(Favourites.isFavourite("rOsE "));
    assertFalse(Favourites.isFavourite("posy"));
    assertFalse(Favourites.isFavourite("sunflower"));
  }
}