import static java.time.LocalDateTime.parse;
import static java.time.ZoneId.of;
import static java.time.format.DateTimeFormatter.ofPattern;

interface TimeWhereverIgo {
  static String getFriendDateAndTime(String myTime, String myZone, String friendZone) {
    var format = ofPattern("dd-MM-yyyy HH:mm");
    return parse(myTime, format).atZone(of(myZone)).withZoneSameInstant(of(friendZone)).format(format);
  }
}