import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MovieTest {
  @Test
  void sample() {
    assertEquals(43, Movie.movie(500, 15, 0.9));
    assertEquals(24, Movie.movie(100, 10, 0.95));
  }
}
