import static java.time.LocalTime.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

interface Time {
  static String convertTime(String time) {
    return parse(time, ofPattern("hh:mm:ssa")).format(ofPattern("HH:mm:ss"));
  }
}