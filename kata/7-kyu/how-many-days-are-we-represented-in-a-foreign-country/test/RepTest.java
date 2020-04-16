import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RepTest {
  @Test
  public void testRepresentation() {
    assertEquals(17, Representation.daysRepresented(new int[][] {{10, 15}, {25, 35}}));
    assertEquals(19, Representation.daysRepresented(new int[][] {{10, 15}, {12, 17}, {25, 35}}));
    assertEquals(24, Representation.daysRepresented(new int[][] {{2, 8}, {220, 229}, {10, 16}}));
  }
}
