import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ModSystemTest {
  @Test
  public void testOne() {
    assertEquals("-3--5--2--1-", ModSystem.fromNb2Str(187, new int[] {8, 7, 5, 3}));
  }
}
