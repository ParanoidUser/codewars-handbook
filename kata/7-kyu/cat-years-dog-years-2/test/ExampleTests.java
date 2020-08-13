import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 0}, Dinglemouse.ownedCatAndDog(9, 7));
    assertArrayEquals(new int[]{1, 1}, Dinglemouse.ownedCatAndDog(15, 15));
    assertArrayEquals(new int[]{1, 1}, Dinglemouse.ownedCatAndDog(18, 21));
    assertArrayEquals(new int[]{2, 2}, Dinglemouse.ownedCatAndDog(24, 24));
    assertArrayEquals(new int[]{10, 10}, Dinglemouse.ownedCatAndDog(56, 64));
  }
}
