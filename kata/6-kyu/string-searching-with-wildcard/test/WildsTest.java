import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WildsTest {
  private final String haystack = "Once upon a midnight dreary, while I pondered, weak and weary";

  @Test
  void normalSearchTest() {
    assertEquals(0, SearchEngine.find("Once", haystack));
    assertEquals(12, SearchEngine.find("midnight", haystack));
    assertEquals(-1, SearchEngine.find("codewars", haystack));
  }

  @Test
  void wildSearchTest() {
    assertEquals(7, SearchEngine.find("gleggggooo___eplexhexflexmexkex", "googgoogleggggoooglxeplexhexflexmexkex"));
    assertEquals(5, SearchEngine.find("_po_", haystack));
    assertEquals(12, SearchEngine.find("___night", haystack));
    assertEquals(23, SearchEngine.find("ex_", "googgoogleggggoooglxeplexhexflexmexkex"));
  }
}