import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpoonerTest {
  @Test
  void sample() {
    assertEquals("pit nicking", new Spooner().spoonerize("nit picking"));
    assertEquals("bedding wells", new Spooner().spoonerize("wedding bells"));
    assertEquals("belly jeans", new Spooner().spoonerize("jelly beans"));
  }
}
