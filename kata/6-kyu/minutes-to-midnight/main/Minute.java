import static java.time.ZoneOffset.UTC;
import static java.time.temporal.ChronoField.MINUTE_OF_DAY;

import java.util.Date;

class Minute {
  String countMinutes(Date d) {
    var time = d.toInstant().atZone(UTC);
    int min = 1440 - time.get(MINUTE_OF_DAY) - Math.min(time.getSecond(), 1);
    return min + " minute" + (min == 1 ? "" : "s");
  }
}