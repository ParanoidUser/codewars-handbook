import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

interface Solution {
  static String timeMath(String time1, String op, String time2) {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss").withResolverStyle(ResolverStyle.LENIENT);
    LocalTime t1 = LocalTime.parse(time1, format);
    LocalTime t2 = LocalTime.parse(time2, format);

    return op.equals("+") ?
        t1.plusHours(t2.getHour()).plusMinutes(t2.getMinute()).plusSeconds(t2.getSecond()).format(format) :
        t1.minusHours(t2.getHour()).minusMinutes(t2.getMinute()).minusSeconds(t2.getSecond()).format(format);
  }
}