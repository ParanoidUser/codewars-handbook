import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderingTest {
  private Ordering ordering = new Ordering();

  @Test
  public void test1_HelloWorld() {
    assertEquals(" !,HWdellloor", ordering.orderWord("Hello, World!"));
  }

  @Test
  public void test2_completesolution() {
    assertEquals("ceeillmnooopsttu", ordering.orderWord("completesolution"));
  }

  @Test
  public void test3_nonletters() {
    assertEquals("!\"#$%&(*@[]^", ordering.orderWord("\"][@!#$*(^&%"));
  }

  @Test
  public void test4_lettersandnot() {
    assertEquals("!\"#$%&(@[]^addilorrwz", ordering.orderWord("i\"d][@z!#$r(^a&world%"));
  }

  @Test
  public void test7_null_empty() {
    assertEquals("Invalid String!", ordering.orderWord(null));
    assertEquals("Invalid String!", ordering.orderWord(""));
  }
}
