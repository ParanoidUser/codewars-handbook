import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PeacefulYardTest {
  @Test
  public void exampleTests() {
    assertTrue(PeacefulYard.peacefulYard(new String[] {
              "------------",
              "------------",
              "-L----------",
              "------------",
              "------------",
              "------------"
            }, 10));
    assertFalse(PeacefulYard.peacefulYard(new String[] {
              "------------",
              "---M--------",
              "------------",
              "------------",
              "-------R----",
              "------------"
            }, 6));
    assertTrue(PeacefulYard.peacefulYard(new String[] {
              "-----------L",
              "--R---------",
              "------------",
              "------------",
              "------------",
              "--M---------"
            }, 4));
  }
}
