import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ExampleTest {
  @Test
  public void exampleTests() {
    assertEquals("should return empty for the same content", List.of(), Kata.diff(List.of('a', 'b'), List.of('a', 'b')));
    assertEquals("should return A if B is empty", List.of('a', 'b'), Kata.diff(List.of('a', 'b'), List.of()));
    assertEquals("should return B if A is empty", List.of('a', 'b'), Kata.diff(List.of(), List.of('a', 'b')));
    assertEquals("should return empty for the empty content", List.of(), Kata.diff(List.of(), List.of()));
    assertEquals("should return the last character", List.of('z'), Kata.diff(List.of('a', 'b', 'z'), List.of('a', 'b')));
    assertEquals("should return the sorted characters", List.of('d', 'e', 'j', 'z'), Kata.diff(List.of('a', 'b', 'z', 'd', 'e', 'd'), List.of('a', 'b', 'j', 'j')));
  }
}
