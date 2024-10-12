import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class HowManyStreetsTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 4, 1}, HowManyStreets.countStreets(
        new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seven"},
        new String[][]{{"first", "second"}, {"second", "seven"}, {"sixth", "fourth"}}));

    assertArrayEquals(new int[]{8, 6, 0, 4, 1, 7, 0, 8, 3, 2, 5}, HowManyStreets.countStreets(
        new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"},
        new String[][]{{"j", "a"}, {"b", "i"}, {"c", "d"}, {"e", "j"}, {"i", "g"}, {"a", "i"}, {"f", "e"}, {"a", "j"}, {"e", "a"}, {"e", "h"}, {"h", "b"}}));

    assertArrayEquals(new int[]{0}, HowManyStreets.countStreets(
        new String[]{"first", "second"},
        new String[][]{{"second", "first"}}));

    assertArrayEquals(new int[]{0, 1, 0, 0, 1}, HowManyStreets.countStreets(
        new String[]{"Drive", "DrivE", "carefully"},
        new String[][]{{"Drive", "DrivE"}, {"Drive", "carefully"}, {"DrivE", "Drive"}, {"Drive", "DrivE"}, {"carefully", "Drive"}}));
  }
}