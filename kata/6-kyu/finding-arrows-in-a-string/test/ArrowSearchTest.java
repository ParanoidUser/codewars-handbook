import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArrowSearchTest {
  @Test
  void sample() {
    assertEquals(1, ArrowSearch.searchArrows(">."));
    assertEquals(-3, ArrowSearch.searchArrows("<--.."));
    assertEquals(-2, ArrowSearch.searchArrows("><=><--"));
    assertEquals(11, ArrowSearch.searchArrows(">===>->"));
    assertEquals(0, ArrowSearch.searchArrows("......"));
    assertEquals(0, ArrowSearch.searchArrows("<-->"));
    assertEquals(3, ArrowSearch.searchArrows("-->"));
  }
}