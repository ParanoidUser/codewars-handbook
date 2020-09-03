import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DoorTest {
  @Test
  void sample() {
    assertTrue(new GreenGlassDoor().stepThroughWith("comment"));
  }
}
