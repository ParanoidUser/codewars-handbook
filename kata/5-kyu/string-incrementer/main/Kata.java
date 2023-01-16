import static java.math.BigInteger.ONE;
import static java.util.regex.Pattern.compile;

import java.math.BigInteger;

interface Kata {
  static String incrementString(String str) {
    return str.matches(".*(?<!\\d)") ? str + 1 : compile("\\d+$").matcher(str)
        .replaceAll(r -> String.format("%0" + r.group().length() + "d", new BigInteger(r.group()).add(ONE)));
  }
}