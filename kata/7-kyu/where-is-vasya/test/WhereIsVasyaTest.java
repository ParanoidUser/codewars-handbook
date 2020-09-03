import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WhereIsVasyaTest {
  @Test
  void sample() {
    assertEquals(2, WhereIsVasya.whereIsHe(3, 1, 1));
    assertEquals(3, WhereIsVasya.whereIsHe(5, 2, 3));
  }
}
