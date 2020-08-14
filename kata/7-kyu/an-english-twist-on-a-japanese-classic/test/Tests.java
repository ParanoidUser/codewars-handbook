import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Tests {
  @Test
  void sample() {
    assertEquals(List.of(), Shiritori.theGame(List.of()));
    assertEquals(List.of(), Shiritori.theGame(List.of("", "", "", "", "", "", "")));
    assertEquals(List.of("ab", "bc"), Shiritori.theGame(List.of("ab", "bc", "", "de", "", "", "")));
    assertEquals(List.of("dog", "goose"), Shiritori.theGame(List.of("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc")));
    assertEquals(List.of("dog", "goose", "elephant", "tiger"), Shiritori.theGame(List.of("dog", "goose", "elephant", "tiger", "cat", "rhino", "rhino", "orc")));
    assertEquals(List.of("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat"), Shiritori.theGame(List.of("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat")));
  }
}
