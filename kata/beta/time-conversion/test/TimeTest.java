import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TimeTest {
  @Test
  void sample() {
    assertEquals("19:05:45", Time.convertTime("07:05:45PM"));
  }
}