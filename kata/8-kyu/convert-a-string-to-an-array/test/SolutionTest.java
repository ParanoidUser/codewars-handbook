import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new String[] {"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
    assertArrayEquals(new String[] {"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
  }
}
