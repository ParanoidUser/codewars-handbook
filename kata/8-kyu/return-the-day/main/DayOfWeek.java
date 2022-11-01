import static java.util.List.of;

interface DayOfWeek {
  static String getDay(int n) {
    return of("Wrong, please enter a number between 1 and 7", "Sunday", "Monday", "Tuesday",
        "Wednesday", "Thursday", "Friday", "Saturday").get(n < 1 || n > 7 ? 0 : n);
  }
}