import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumbersTest {
  @Test
  public void test1() {
    assertEquals(1234.79, Numbers.paste(1234, 79), 0.00);
  }

  @Test
  public void test2() {
    assertEquals(98435789.26, Numbers.paste(98435789, 26), 0.00);
  }
}