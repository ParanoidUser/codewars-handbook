import static java.time.LocalDateTime.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

interface FindTheDate {
  static String getDate(String fromDate, int numOfHours) {
    return parse(fromDate, ofPattern("yyyy.MM.dd HH:mm")).plusHours(numOfHours).format(ofPattern("yyyy.MM.dd"));
  }
}
