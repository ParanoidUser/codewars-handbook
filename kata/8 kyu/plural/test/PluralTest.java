import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PluralTest {
  @Test
  public void basicTest() {
    assertTrue(Plural.isPlural(0f));
    assertTrue(Plural.isPlural(0.5f));
    assertTrue(Plural.isPlural(1f));
    assertTrue(Plural.isPlural(100f));
  }
}
