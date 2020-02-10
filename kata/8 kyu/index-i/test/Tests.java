import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Tests {
  @Before
  public void setUp() {
    Array.array = new int[] {1, 2, 3, 4};
  }

  @Test
  public void notNullTest() {
    assertNotNull(Array.array);
  }

  @Test
  public void notEmptyTest() {
    assertTrue(Array.array.length > 0);
  }

  @Test
  public void compareTests() {
    for (int i = 0; i < Array.array.length; i++) {
      assertEquals(Array.array[i], Array.array(i));
    }
  }
}
