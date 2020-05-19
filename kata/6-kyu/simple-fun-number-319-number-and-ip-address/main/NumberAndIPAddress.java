import static java.util.regex.Pattern.compile;

import java.util.function.BiFunction;
import java.util.function.IntToLongFunction;

interface NumberAndIPAddress {
  static String numberAndIPaddress(String s) {
    var m = compile("(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)").matcher(s);
    BiFunction<Integer, Integer, Long> ls = (group, bits) -> Long.parseLong(m.group(group)) << bits;
    IntToLongFunction rs = bits -> Long.parseLong(s) >> bits & 0xff;
    return m.matches() ? ls.apply(1, 24) + ls.apply(2, 16) + ls.apply(3, 8) + ls.apply(4, 0) + "" :
        rs.applyAsLong(24) + "." + rs.applyAsLong(16) + "." + rs.applyAsLong(8) + "." + rs.applyAsLong(0);
  }
}
