import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
  @Test
  public void testInteger() {
    assertEquals("2,4,5,2", ArrayPrinter.printArray(new Integer[] {2, 4, 5, 2}));
  }
}
