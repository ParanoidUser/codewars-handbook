import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SortingTest {
  @Test
  void sample() {
    assertEquals(List.of("Algebra", "English", "Geometry", "History"), sorter.sort(List.of("Algebra", "History", "Geometry", "English")));
    assertEquals(List.of("Algebra", "english", "Geometry", "history"), sorter.sort(List.of("Algebra", "history", "Geometry", "english")));
    assertEquals(List.of("$istory", "**English", "Alg#bra", "Geom^try"), sorter.sort(List.of("Alg#bra", "$istory", "Geom^try", "**English")));
  }
}
