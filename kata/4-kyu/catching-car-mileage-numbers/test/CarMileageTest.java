import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarMileageTest {
  @Test
  void sample() {
    assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
    assertEquals(1, CarMileage.isInteresting(98, new int[0]));
    assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
    assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
    assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
    assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
    assertEquals(2, CarMileage.isInteresting(11211, new int[]{1337, 256}));
  }
}