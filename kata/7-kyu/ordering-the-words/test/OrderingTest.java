import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OrderingTest {
  @Test
  void sample() {
    var ordering = new Ordering();
    assertEquals(" !,HWdellloor", ordering.orderWord("Hello, World!"));
    assertEquals("ceeillmnooopsttu", ordering.orderWord("completesolution"));
    assertEquals("!\"#$%&(*@[]^", ordering.orderWord("\"][@!#$*(^&%"));
    assertEquals("!\"#$%&(@[]^addilorrwz", ordering.orderWord("i\"d][@z!#$r(^a&world%"));
    assertEquals("Invalid String!", ordering.orderWord(null));
    assertEquals("Invalid String!", ordering.orderWord(""));
  }
}
