import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhereIsVasyaTest {
  @Test
  public void test1() {
    assertEquals(2, WhereIsVasya.whereIsHe(3, 1, 1));
  }

  @Test
  public void test2() {
    assertEquals(3, WhereIsVasya.whereIsHe(5, 2, 3));
  }
}
