import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpoonerTest {
  @Test
  public void basicTests() {
    assertEquals("pit nicking", Spooner.spoonerize("nit picking"));
    assertEquals("bedding wells", Spooner.spoonerize("wedding bells"));
    assertEquals("belly jeans", Spooner.spoonerize("jelly beans"));
  }
}
