import static java.util.Arrays.stream;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

interface TimeFormatter {
  static String toHumanTime(final String time) {
    var clock = new String[]{"o'clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "half"};
    var units = stream(time.replaceAll("[^\\d:]", "").split(":")).mapToInt(Integer::parseInt).toArray();

    IntUnaryOperator hh = h -> h % 12 > 0 ? h % 12 : 12;
    IntFunction<String> mm = m -> {
      var suffix = "";
      if (m != 15 && m != 30) {
        suffix = " minute" + (m > 1 ? "s" : "");
      }
      return clock[m] + suffix;
    };

    if (units[1] > 30) {
      return mm.apply(60 - units[1]) + " to " + clock[hh.applyAsInt(units[0] + 1)];
    }
    return units[1] > 0 ? mm.apply(units[1]) + " past " + clock[hh.applyAsInt(units[0])] : clock[hh.applyAsInt(units[0])] + " " + clock[0];
  }
}
