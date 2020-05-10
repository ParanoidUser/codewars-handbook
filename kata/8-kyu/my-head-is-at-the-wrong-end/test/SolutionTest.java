import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"head", "body", "tail"}, WrongEndHead.fixTheMeerkat(new String[]{"tail", "body", "head"}));
    assertArrayEquals(new String[]{"heads", "body", "tails"}, WrongEndHead.fixTheMeerkat(new String[]{"tails", "body", "heads"}));
    assertArrayEquals(new String[]{"top", "middle", "bottom"}, WrongEndHead.fixTheMeerkat(new String[]{"bottom", "middle", "top"}));
    assertArrayEquals(new String[]{"upper legs", "torso", "lower legs"}, WrongEndHead.fixTheMeerkat(new String[]{"lower legs", "torso", "upper legs"}));
    assertArrayEquals(new String[]{"sky", "rainbow", "ground"}, WrongEndHead.fixTheMeerkat(new String[]{"ground", "rainbow", "sky"}));
  }
}
