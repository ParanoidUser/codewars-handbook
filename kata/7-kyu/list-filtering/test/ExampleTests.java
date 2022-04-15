import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")));
    assertEquals(List.of(1, 0, 15), Kata.filterList(List.of(1, "a", "b", 0, 15)));
    assertEquals(List.of(1, 2, 123), Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
  }
}