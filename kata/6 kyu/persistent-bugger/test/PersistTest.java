import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersistTest {
  @Test
  public void basicTests() {
    assertEquals(3, Persist.persistence(39));
    assertEquals(0, Persist.persistence(4));
    assertEquals(2, Persist.persistence(25));
    assertEquals(4, Persist.persistence(999));
  }
}
