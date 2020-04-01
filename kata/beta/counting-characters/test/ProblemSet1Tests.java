import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemSet1Tests {
  @Test
  public void count_one_charTest1() {
    assertEquals(3, Count.count_one_char("missippi", 'i'));
  }
}