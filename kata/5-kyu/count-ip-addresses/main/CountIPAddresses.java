import static java.util.stream.Stream.of;

import java.util.function.ToLongFunction;

interface CountIPAddresses {
  static long ipsBetween(String start, String end) {
    ToLongFunction<String> int32 = ip -> of(ip.split("\\.")).map(Long::parseLong).reduce((s, o) -> s * 256 + o).orElse(0L);
    return int32.applyAsLong(end) - int32.applyAsLong(start);
  }
}