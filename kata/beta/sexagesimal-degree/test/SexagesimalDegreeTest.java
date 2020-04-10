import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SexagesimalDegreeTest {
  @Test
  public void testStaticCoordinates() {
    assertEquals("48° 51′ 30″ N, 2° 17′ 40″ E", SexagesimalDegree.convert(48.858222, 2.2945));
    assertEquals("33° 51′ 22″ S, 151° 12′ 55″ E", SexagesimalDegree.convert(-33.856111, 151.215278));
    assertEquals("40° 41′ 21″ N, 74° 2′ 40″ W", SexagesimalDegree.convert(40.68923, -74.04447));
  }
}
