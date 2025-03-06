import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolarSystemTest {
  @Test
  void sample() {
    assertArrayEquals(new char[]{'<', '>', '>', '<', '>', '<'}, new SolarSystem().annotate(
        new String[]{"Mars", "Asteroid", "Venus", "Jupiter", "Asteroid", "Earth", "Pluto"}));
    assertArrayEquals(new char[]{'=', '=', '>', '>'}, new SolarSystem().annotate(
        new String[]{"Asteroid", "Asteroid", "Asteroid", "Earth", "Jupiter"}));
    assertArrayEquals(new char[]{'>', '>', '<', '<', '>', '<', '<', '<', '<', '>'}, new SolarSystem().annotate(
        new String[]{"Mercury", "Venus", "Earth", "Mars", "Asteroid", "Jupiter", "Saturn", "Uranus", "Neptune", "Asteroid", "Pluto"}));
    assertArrayEquals(new char[0], new SolarSystem().annotate(new String[0]));
  }
}