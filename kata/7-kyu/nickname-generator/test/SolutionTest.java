import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Jim", Generator.nickname("Jimmy"));
    assertEquals("Sam", Generator.nickname("Samantha"));
    assertEquals("Kay", Generator.nickname("Kayne"));
    assertEquals("Mel", Generator.nickname("Melissa"));
    assertEquals("Jam", Generator.nickname("James"));
    assertEquals("Greg", Generator.nickname("Gregory"));
    assertEquals("Error: Name too short", Generator.nickname("Sam"));
  }
}
