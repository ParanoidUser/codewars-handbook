import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void staticTests() {
    assertEquals("no one likes this", Solution.whoLikesIt());
    assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
    assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
    assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
    assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
  }
}
