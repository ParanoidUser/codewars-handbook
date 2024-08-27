import static java.time.Year.of;

interface DaysInAYear {
  static String daysInTheYear(int year) {
    return year + " has " + of(year).length() + " days";
  }
}