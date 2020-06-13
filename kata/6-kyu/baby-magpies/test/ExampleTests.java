import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertTrue(Dinglemouse.child("BWBWBW", "BWBWBB"));
    assertTrue(Dinglemouse.child("BWBWBB", "WWWWBB"));
    assertFalse(Dinglemouse.child("BWBWBW", "WWWWBB"));
    assertFalse(Dinglemouse.child("BWBWBW", "BWBWBW"));

    assertTrue(Dinglemouse.grandchild("BWBWBW", "BWBWBB"));
    assertTrue(Dinglemouse.grandchild("", ""));
    assertFalse(Dinglemouse.grandchild("B", "W"));
    assertFalse(Dinglemouse.grandchild("BWBWBW", "WBWBWB"));
  }
}
