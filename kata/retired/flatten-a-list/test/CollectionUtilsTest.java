import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class CollectionUtilsTest {
  @Test
  void testEmpty() {
    assertTrue(CollectionUtils.flattenList(null).isEmpty());
  }

  @Test
  void testFlattening() {
    assertEquals(List.of(5, 4, 3, 2), CollectionUtils.flattenList(List.of(5, List.of(4, 3, 2))));
  }

  @Test
  void testDeepFlattening() {
    var list = List.of(1, List.of(2, 3, 4, List.of(5)), List.of(), List.of(6, 7, 8));
    assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), CollectionUtils.flattenList(list));
  }
}