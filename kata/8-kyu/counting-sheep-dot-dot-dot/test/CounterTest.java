import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CounterTest {
  @Test
  void sample() {
    assertEquals(17, new Counter().countSheeps(new Boolean[]{
        true, true, true, false, true, true, true, true, true, false, true, false,
        true, false, false, true, true, true, true, true, false, false, true, true
    }));

    assertEquals(11, new Counter().countSheeps(new Boolean[]{
        true, true, null, false, true, true, null, false, true, false,
        false, true, null, true, true, true, false, false, true, true
    }));
  }
}
