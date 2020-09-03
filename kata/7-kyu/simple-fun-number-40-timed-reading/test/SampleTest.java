import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(7, Kata.timedReading(4, "The Fox asked the stork, 'How is the soup?'"));
    assertEquals(0, Kata.timedReading(1, "..."));
    assertEquals(3, Kata.timedReading(3, "This play was good for us."));
    assertEquals(5, Kata.timedReading(3, "Suddenly he stopped, and glanced up at the houses"));
    assertEquals(11, Kata.timedReading(6, "Zebras evolved among the Old World horses within the last four million years."));
    assertEquals(6, Kata.timedReading(5, "Although zebra species may have overlapping ranges, they do not interbreed."));
    assertEquals(0, Kata.timedReading(1, "Oh!"));
    assertEquals(14, Kata.timedReading(5,"Now and then, however, he is horribly thoughtless, and seems to take a real delight in giving me pain."));
  }
}
