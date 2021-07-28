import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    String string = "This is an example. Return the nth occurrence of example in this example string.";
    assertEquals(-1, FindOccurrence.findNthOccurrence("example", string, 0));
    assertEquals(11, FindOccurrence.findNthOccurrence("example", string, 1));
    assertEquals(49, FindOccurrence.findNthOccurrence("example", string, 2));
    assertEquals(65, FindOccurrence.findNthOccurrence("example", string, 3));
    assertEquals(-1, FindOccurrence.findNthOccurrence("example", string, 4));
    assertEquals(-1, FindOccurrence.findNthOccurrence("Test", "Test1 Test2 Test3 Test4", 6));
  }
}
