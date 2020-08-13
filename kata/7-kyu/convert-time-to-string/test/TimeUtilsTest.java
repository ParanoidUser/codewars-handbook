import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TimeUtilsTest {
  @Test
  void sample() {
    assertEquals("1 1 1 1", TimeUtils.convertTime(90061));
    assertEquals("-1 -1 -1 -1", TimeUtils.convertTime(-90061));
  }
}
