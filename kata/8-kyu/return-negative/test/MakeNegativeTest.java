import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MakeNegativeTest {
  @Test
  public void test1() {
    assertEquals(-42, Kata.makeNegative(42));
  }
}
