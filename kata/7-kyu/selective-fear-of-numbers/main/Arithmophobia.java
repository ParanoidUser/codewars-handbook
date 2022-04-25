import static java.util.Map.of;

interface Arithmophobia {
  static boolean amIAfraid(String day, int num) {
    return of("Mo", num == 12, "Tu", num > 95, "We", num == 34, "Th", num == 0, "Fr", num % 2 == 0, "Sa", num == 56)
        .getOrDefault(day.substring(0, 2), Math.abs(num) == 666);
  }
}
