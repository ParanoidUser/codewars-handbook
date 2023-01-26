import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    PaginationHelper<Character> helper = new PaginationHelper<>(List.of('a', 'b', 'c', 'd', 'e', 'f'), 4);
    assertEquals(2, helper.pageCount());
    assertEquals(6, helper.itemCount());
    assertEquals(4, helper.pageItemCount(0));
    assertEquals(2, helper.pageItemCount(1));
    assertEquals(-1, helper.pageItemCount(2));
    assertEquals(0, helper.pageIndex(2));
    assertEquals(1, helper.pageIndex(5));
    assertEquals(-1, helper.pageIndex(-10));
    assertEquals(-1, helper.pageIndex(20));

    PaginationHelper<Character> helper1 = new PaginationHelper<>(
        List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y'), 10);
    assertEquals(4, helper1.pageItemCount(2));
  }
}