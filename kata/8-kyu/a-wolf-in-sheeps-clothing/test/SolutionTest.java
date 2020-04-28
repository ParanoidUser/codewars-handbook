import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
    assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
    assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
    assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
    assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
  }
}