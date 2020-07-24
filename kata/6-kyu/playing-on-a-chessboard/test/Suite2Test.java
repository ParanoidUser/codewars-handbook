import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Suite2Test {
  @Test
  void sample() {
    assertEquals("[0]", Suite2.game(0));
    assertEquals("[1, 2]", Suite2.game(1));
    assertEquals("[32]", Suite2.game(8));
    assertEquals("[562501500001, 2]", Suite2.game(750001));
  }
}
