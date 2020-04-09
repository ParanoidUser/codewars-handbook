import static java.time.LocalTime.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

class Time {
  static String convertTime(String time) {
    return parse(time, ofPattern("hh:mm:ssa")).format(ofPattern("HH:mm:ss"));
  }
}