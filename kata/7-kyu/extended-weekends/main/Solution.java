import static java.time.YearMonth.of;

interface Solution {
  static String[] solve(int a, int b) {
    var search = new String[]{"", "", "0"};
    for (var date = of(a, 1); of(b + 1, 1).isAfter(date); date = date.plusMonths(1)) {
      if (date.atDay(1).getDayOfWeek().getValue() == 5 && date.lengthOfMonth() > 30) {
        search[search[0].isEmpty() ? 0 : 1] = date.getMonth().name();
        search[2] = Integer.parseInt(search[2]) + 1 + "";
      }
    }
    return search;
  }
}