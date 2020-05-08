import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void sample() {
    Room[] officeA = {
        new Room("XXX", 3),
        new Room("XXXXX", 6),
        new Room("XXXXXX", 9)
    };
    assertArrayEquals(new int[]{0, 1, 3}, (int[]) TheOffice.meeting(officeA, 4));

    Room[] officeB = {
        new Room("XXX", 1),
        new Room("XXXXXX", 6),
        new Room("X", 2),
        new Room("XXXXXX", 8),
        new Room("X", 3),
        new Room("XXX", 1)
    };
    assertArrayEquals(new int[]{0, 0, 1, 2, 2}, (int[]) TheOffice.meeting(officeB, 5));

    Room[] officeC = {
        new Room("XXXX", 7),
        new Room("XXXXXXX", 3),
        new Room("XXX", 1),
        new Room("XXXXXXXX", 3),
        new Room("XXXXXX", 3),
        new Room("XX", 5)
    };
    assertArrayEquals(new int[]{3, 0, 0, 0, 0, 1}, (int[]) TheOffice.meeting(officeC, 4));
  }

  @Test
  void no_chairs_are_needed() {
    Room[] office = {
        new Room("XX", 2),
        new Room("XXXX", 6),
        new Room("XXXXX", 4)
    };
    assertEquals("Game On", TheOffice.meeting(office, 0));
  }

  @Test
  void not_enough_chairs() {
    Room[] office = {
        new Room("XX", 2),
        new Room("XXXX", 6),
        new Room("XXXXX", 4)
    };
    assertEquals("Not enough!", TheOffice.meeting(office, 3));
    assertEquals("Not enough!", TheOffice.meeting(new Room[0], 1));
  }
}
