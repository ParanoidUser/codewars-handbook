import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("11121122342", JomoPipi.numericals("hello hello"));
    assertEquals("1112111121311", JomoPipi.numericals("Hello, World!"));
    assertEquals("11121111213112111131224132411122", JomoPipi.numericals("Hello, World! It's me, JomoPipi!"));
  }
}
