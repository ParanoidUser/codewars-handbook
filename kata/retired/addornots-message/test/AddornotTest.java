import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddornotTest {
  @Test
  void sample() {
    assertEquals("My", Addornot.addOrNot(new String[][]{{"M", "1"}, {"y", "1"}}));
    assertEquals("Name", Addornot.addOrNot(new String[][]{{"g", "0"}, {"N", "1"}, {"a", "1"}, {"M", "0"}, {"m", "1"}, {"e", "1"}}));
    assertEquals("is Addornot", Addornot.addOrNot(new String[][]{{"Hello", "0"}, {"is", "1"}, {"thanks42", "0"}, {" ", "1"}, {"o", "0"}, {"Add", "1"}, {"ornot", "1"}}));
  }
}
