import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertEquals(List.of(), Kata.diff(List.of('a', 'b'), List.of('a', 'b')));
    assertEquals(List.of('a', 'b'), Kata.diff(List.of('a', 'b'), List.of()));
    assertEquals(List.of('a', 'b'), Kata.diff(List.of(), List.of('a', 'b')));
    assertEquals(List.of(), Kata.diff(List.of(), List.of()));
    assertEquals(List.of('z'), Kata.diff(List.of('a', 'b', 'z'), List.of('a', 'b')));
    assertEquals(List.of('d', 'e', 'j', 'z'), Kata.diff(List.of('a', 'b', 'z', 'd', 'e', 'd'), List.of('a', 'b', 'j', 'j')));
  }
}
