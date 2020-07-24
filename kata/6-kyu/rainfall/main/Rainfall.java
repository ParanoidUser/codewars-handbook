import static java.util.stream.Stream.of;

import java.util.stream.DoubleStream;

interface Rainfall {
  static double mean(String town, String strng) {
    return stream(town, strng).average().orElse(-1);
  }

  static double variance(String town, String strng) {
    return stream(town, strng).map(m -> Math.pow(m - mean(town, strng), 2)).average().orElse(-1);
  }

  private static DoubleStream stream(String town, String data) {
    return of(data.split("\n")).filter(s -> s.startsWith(town + ":"))
        .flatMapToDouble(s -> of(s.replaceAll("[^\\d.]", " ").trim().split("\\s+")).mapToDouble(Double::parseDouble));
  }
}
