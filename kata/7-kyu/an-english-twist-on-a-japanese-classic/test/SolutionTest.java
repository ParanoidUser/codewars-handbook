import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(List.of(), new Shiritori().theGame(List.of()));
    assertEquals(List.of(), new Shiritori().theGame(List.of("", "", "", "", "", "", "")));
    assertEquals(List.of("ab", "bc"), new Shiritori().theGame(List.of("ab", "bc", "", "de", "", "", "")));
    assertEquals(List.of("dog", "goose"), new Shiritori().theGame(List.of("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc")));
    assertEquals(List.of("dog", "goose", "elephant", "tiger"), new Shiritori().theGame(List.of("dog", "goose", "elephant", "tiger", "cat", "rhino", "rhino", "orc")));
    assertEquals(List.of("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat"), new Shiritori().theGame(List.of("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat")));
  }
}