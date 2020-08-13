import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;
import java.util.Date;
import org.junit.jupiter.api.Test;

class MinuteTest {
  @Test
  void sample() {
    var midday = ZonedDateTime.parse("2020-05-29T12:00:00Z");
    assertEquals("720 minutes", new Minute().countMinutes(Date.from(midday.toInstant())));

    var midnight = ZonedDateTime.parse("2020-05-29T23:59:00Z");
    assertEquals("1 minute", new Minute().countMinutes(Date.from(midnight.toInstant())));
  }
}