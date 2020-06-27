import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertEquals(List.of("good", "luck"), Kata.maxMatch("goodluck"));
    assertEquals(List.of("e", "w", "in", "g", "s", "a"), Kata.maxMatch("ewingsa"));
  }
}