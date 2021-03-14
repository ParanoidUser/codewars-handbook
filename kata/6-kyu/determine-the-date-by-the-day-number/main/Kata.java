import static java.time.LocalDate.ofYearDay;
import static java.time.format.DateTimeFormatter.ofPattern;

interface Kata {
  static String getDay(int day, boolean isLeap) {
    return ofPattern("LLLL, d").format(ofYearDay(isLeap ? 2020 : 2021, day));
  }
}