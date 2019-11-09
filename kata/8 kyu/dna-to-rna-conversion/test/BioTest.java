import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BioTest {
  @Test
  public void testDna() {
    assertEquals("UUUU", Bio.dnaToRna("TTTT"));
  }

  @Test
  public void testDna2() {
    assertEquals("GCAU", Bio.dnaToRna("GCAT"));
  }
}
