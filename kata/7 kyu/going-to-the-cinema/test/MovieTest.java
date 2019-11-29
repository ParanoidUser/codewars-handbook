import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MovieTest {
  @Test
  public void test1() {
    assertEquals(43, Movie.movie(500, 15, 0.9));
    assertEquals(24, Movie.movie(100, 10, 0.95));
  }
}
