import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

import java.util.function.BiFunction;

interface TimeFormatter {
  static String formatDuration(int sec) {
    BiFunction<Integer, String, String> toUnit = (t, u) -> t < 1 ? "" : t + " " + u + (t > 1 ? "s" : "");
    return sec < 1 ? "now" : of(
        toUnit.apply(sec / 31536000, "year"),
        toUnit.apply(sec / 86400 % 365, "day"),
        toUnit.apply(sec / 3600 % 24, "hour"),
        toUnit.apply(sec / 60 % 60, "minute"),
        toUnit.apply(sec % 3600 % 60, "second")
    ).filter(s -> !s.isEmpty()).collect(joining(", ")).replaceAll(", (?!.+,)", " and ");
  }
}