import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Stg", TheCullingOfStratholme.purify("String"));
    assertEquals("BatChesg", TheCullingOfStratholme.purify("BatChesting"));
    assertEquals("on Men", TheCullingOfStratholme.purify("Iron Maiden"));
    assertEquals("The tea Nepal very hot", TheCullingOfStratholme.purify("The tea in Nepal is very hot"));
    assertEquals("", TheCullingOfStratholme.purify("IIIIiiiiiiIIIII"));
    assertEquals("", TheCullingOfStratholme.purify(""));
  }
}
