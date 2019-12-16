import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InfiniteCrisis {
  @Test
  public void vsZoom() {
    assertEquals("Yes", Kata.helpZoom(new int[] {1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1}));
    assertEquals("No", Kata.helpZoom(new int[] {1, 1, 0, 0, 0, 0, 1, 1, 0}));
  }
}
