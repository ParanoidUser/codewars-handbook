import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PeacefulYardTest {
  @Test
  void sample() {
    assertTrue(PeacefulYard.peacefulYard(new String[]{
        "------------",
        "------------",
        "-L----------",
        "------------",
        "------------",
        "------------"
    }, 10));

    assertFalse(PeacefulYard.peacefulYard(new String[]{
        "------------",
        "---M--------",
        "------------",
        "------------",
        "-------R----",
        "------------"
    }, 6));

    assertTrue(PeacefulYard.peacefulYard(new String[]{
        "-----------L",
        "--R---------",
        "------------",
        "------------",
        "------------",
        "--M---------"
    }, 4));
  }
}
