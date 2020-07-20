import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CubesTest {
  @Test
  void sample() {
    assertEquals("0 0 Lucky", Cubes.isSumOfCubes("0 9026315 -827&()"));
    assertEquals("Unlucky", Cubes.isSumOfCubes("Once upon a midnight dreary, while100 I pondered, 9026315weak and weary -827&()"));
  }
}
