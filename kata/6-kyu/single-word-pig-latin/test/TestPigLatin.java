import static org.junit.Assert.*;

import org.junit.Test;

public class TestPigLatin {
  @Test
  public void testMap() {
    assertEquals("apmay", PigLatin.translate("map"));
  }

  @Test
  public void testegg() {
    assertEquals("eggway", PigLatin.translate("egg"));
  }

  @Test
  public void testspaghetti() {
    assertEquals("aghettispay", PigLatin.translate("spaghetti"));
  }
}
