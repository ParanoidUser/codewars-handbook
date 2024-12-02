import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(List.of("Ryan", "Yous"), Kata.friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
    assertEquals(List.of(), Kata.friend(List.of("Peter", "Stephen", "Joe")));
  }
}