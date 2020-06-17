import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class CatTest {
  @Test
  void compareTest() {
    var lily1 = new Cat("Lily", 30);
    var lily2 = new Cat("Lily", 12);
    var drake = new Cat("Drake", 15);
    assertEquals(8, lily1.compareTo(drake));
    assertEquals(-8, drake.compareTo(lily2));
    assertEquals(0, lily1.compareTo(lily2));
  }

  @Test
  void testEquals() {
    var lily = new Cat("Lily", 30);
    assertEquals(lily, lily);
    assertEquals(lily, new Cat("Lily", 30));
    assertNotEquals(lily, new Cat("Lily", 12));
    assertNotEquals(lily, new Cat("Drake", 30));
    assertNotEquals(lily, new Object());
    assertNotEquals(null, lily);
  }

  @Test
  void testHashcode() {
    assertEquals(1151229207, new Cat("Lily", 30).hashCode());
    assertEquals(-1163150508, new Cat("Drake", 15).hashCode());
  }
}
