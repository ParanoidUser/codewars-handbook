import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortingTest {
  @Test
  public void basicTest() {
    assertEquals(List.of("Algebra", "History", "Geometry", "English"), sorter.sort(List.of("Algebra", "English", "Geometry", "History")));
  }

  @Test
  public void capitalizationTest() {
    assertEquals(List.of("Algebra", "english", "Geometry", "history"), sorter.sort(List.of("Algebra", "history", "Geometry", "english")));
  }

  @Test
  public void symbolsTest() {
    assertEquals(List.of("$istory", "**English", "Alg#bra", "Geom^try"), sorter.sort(List.of("Alg#bra", "$istory", "Geom^try", "**English")));
  }
}
