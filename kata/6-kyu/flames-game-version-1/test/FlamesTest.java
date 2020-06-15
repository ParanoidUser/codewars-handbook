import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FlamesTest {
  @Test
  void sample() {
    assertEquals("Enemies", Flames.showRelationship("NEIL", "MAE"));
  }
}
