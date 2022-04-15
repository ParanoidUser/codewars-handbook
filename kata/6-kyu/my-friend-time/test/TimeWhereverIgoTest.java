import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TimeWhereverIgoTest {
  @Test
  void sample() {
    assertEquals("27-03-2021 21:41", TimeWhereverIgo.getFriendDateAndTime("27-03-2021 19:41", "Europe/Warsaw", "Africa/Asmara"));
    assertEquals("28-03-2021 05:41", TimeWhereverIgo.getFriendDateAndTime("27-03-2021 19:41", "Europe/Warsaw", "Australia/Sydney"));
    assertEquals("28-03-2021 10:41", TimeWhereverIgo.getFriendDateAndTime("28-03-2021 19:41", "Australia/Sydney", "Europe/Warsaw"));
    assertEquals("19-03-2021 12:01", TimeWhereverIgo.getFriendDateAndTime("19-03-2021 01:01", "America/Halifax", "Asia/Makassar"));
    assertEquals("01-12-2021 00:00", TimeWhereverIgo.getFriendDateAndTime("01-12-2021 00:00", "Europe/Dublin", "Europe/Belfast"));
    assertEquals("07-12-2021 11:59", TimeWhereverIgo.getFriendDateAndTime("07-12-2021 23:59", "UTC+13", "Europe/Berlin"));
  }
}
