import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void createListWithSingleElement() {
    List<Integer> singleElementList = InmutableList.alternativeOf(42);
    assertEquals(1, singleElementList.size());
    assertEquals(42, singleElementList.get(0));
  }

  @Test
  void createListWithMultipleElements() {
    List<String> multiElementList = InmutableList.alternativeOf("apple", "banana", "cherry");
    assertEquals(3, multiElementList.size());
    assertEquals("banana", multiElementList.get(1));
  }

  @Test
  void createListWithVarargs() {
    List<Integer> varargsList = InmutableList.alternativeOf(1, 2, 3, 4, 5);
    assertEquals(5, varargsList.size());
    assertEquals(4, varargsList.get(3));
  }

  @Test
  void checkImmutability() {
    List<String> immutableList = InmutableList.alternativeOf("one", "two", "three");
    assertThrows(UnsupportedOperationException.class, () -> immutableList.add("four"));
  }
}