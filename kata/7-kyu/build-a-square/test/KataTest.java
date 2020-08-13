import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("+++\n+++\n+++", Kata.generateShape(3));
    assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", Kata.generateShape(5));
    assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", Kata.generateShape(8));
  }
}
