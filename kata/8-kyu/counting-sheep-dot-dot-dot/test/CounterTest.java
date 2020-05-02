import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CounterTest {
  @Test
  void sample() {
    Boolean[] withoutNulls = {
        true, true, true, false, true, true, true, true, true, false, true, false,
        true, false, false, true, true, true, true, true, false, false, true, true
    };
    assertEquals(17, Counter.countSheeps(withoutNulls));

    Boolean[] withNulls = {
        true, true, null, false, true, true, null, false, true, false,
        false, true, null, true, true, true, false, false, true, true
    };
    assertEquals(11, Counter.countSheeps(withNulls));
  }
}
