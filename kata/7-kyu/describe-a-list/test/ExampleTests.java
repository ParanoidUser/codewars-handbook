import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("empty", Kata.describeList(List.of()));
    assertEquals("singleton", Kata.describeList(List.of(1)));
    assertEquals("longer", Kata.describeList(List.of(1, 2)));
    assertEquals("empty", Kata.describeList(List.of()));
    assertEquals("singleton", Kata.describeList(List.of(1.5)));
    assertEquals("longer", Kata.describeList(List.of(1.5, 2.5)));
  }
}
