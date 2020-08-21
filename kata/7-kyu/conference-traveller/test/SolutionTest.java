import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Stockholm", Kata.conferencePicker(new String[]{}, new String[]{"Stockholm", "Paris", "Melbourne"}));
    assertEquals("No worthwhile conferences this year!", Kata.conferencePicker(new String[]{"London", "Mexico City", "Melbourne", "Buenos Aires", "Berlin", "Hong Kong"}, new String[]{"Berlin", "Melbourne"}));
  }
}
