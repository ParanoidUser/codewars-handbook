import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basic1() {
    Room[] rooms = {
      new Room("XXX", 3),
      new Room("XXXXX", 6),
      new Room("XXXXXX", 9)
    };
    assertArrayEquals(new int[] {0, 1, 3}, (int[]) TheOffice.meeting(rooms, 4));
  }

  @Test
  public void basic2() {
    Room[] rooms = {
      new Room("XXX", 1),
      new Room("XXXXXX", 6),
      new Room("X", 2),
      new Room("XXXXXX", 8),
      new Room("X", 3),
      new Room("XXX", 1)
    };
    assertArrayEquals(new int[] {0, 0, 1, 2, 2}, (int[]) TheOffice.meeting(rooms, 5));
  }

  @Test
  public void basic3() {
    Room[] rooms = {
      new Room("XX", 2),
      new Room("XXXX", 6),
      new Room("XXXXX", 4)
    };
    assertEquals("Game On", TheOffice.meeting(rooms, 0));
  }

  @Test
  public void basic4() {
    Room[] rooms = {
      new Room("XXXX", 7),
      new Room("XXXXXXX", 3),
      new Room("XXX", 1),
      new Room("XXXXXXXX", 3),
      new Room("XXXXXX", 3),
      new Room("XX", 5)
    };
    assertArrayEquals(new int[] {3, 0, 0, 0, 0, 1}, (int[]) TheOffice.meeting(rooms, 4));
  }
}
