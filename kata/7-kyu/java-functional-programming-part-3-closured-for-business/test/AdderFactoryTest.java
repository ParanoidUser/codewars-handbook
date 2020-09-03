import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdderFactoryTest {
  @Test
  void sample() {
    assertEquals(5, AdderFactory.create(1).applyAsInt(4));
  }
}
