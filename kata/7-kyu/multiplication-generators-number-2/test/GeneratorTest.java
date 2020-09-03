import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GeneratorTest {
  @Test
  void next() {
    Generator gen = Generator.of(1);
    assertEquals("1 x 1 = 1", gen.next());
    assertEquals("1 x 2 = 2", gen.next());
    assertEquals("1 x 3 = 3", gen.next());
    assertEquals("1 x 4 = 4", gen.next());
    assertEquals("1 x 5 = 5", gen.next());
  }
}
