import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AlarmTest {
  @Test
  void sample() {
    assertTrue(Alarm.setAlarm(true, false));
    assertFalse(Alarm.setAlarm(true, true));
    assertFalse(Alarm.setAlarm(false, false));
    assertFalse(Alarm.setAlarm(false, true));
  }
}
