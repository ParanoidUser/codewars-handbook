import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

class GodTest {
  @Test
  void sample() {
    assertInstanceOf(Man.class, God.create()[0]);
  }
}