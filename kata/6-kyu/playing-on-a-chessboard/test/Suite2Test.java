import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Suite2Test {
  @Test
  public void test1() {
    assertEquals("[0]", Suite2.game(0));
  }

  @Test
  public void test2() {
    assertEquals("[1, 2]", Suite2.game(1));
  }

  @Test
  public void test3() {
    assertEquals("[32]", Suite2.game(8));
  }

  @Test
  public void test4() {
    assertEquals("[562501500001, 2]", Suite2.game(750001));
  }
}
