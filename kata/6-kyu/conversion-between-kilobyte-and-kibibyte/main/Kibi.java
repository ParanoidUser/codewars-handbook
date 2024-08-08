import java.util.Map;
import java.util.function.Function;

interface Kibi {
  Map<String, Function<Double, String>> CONVERT = Map.of(
      "TB", v -> String.format("%.3f TiB", v * 0.9094947),
      "GB", v -> String.format("%.3f GiB", v * 0.9313226),
      "MB", v -> String.format("%.3f MiB", v * 0.9536743),
      "kB", v -> String.format("%.3f KiB", v * 0.9765625),
      "KiB", v -> String.format("%.3f kB", v * 1.024),
      "MiB", v -> String.format("%.3f MB", v * 1.048576),
      "GiB", v -> String.format("%.3f GB", v * 1.0737418),
      "TiB", v -> String.format("%.3f TB", v * 1.0995116)
  );

  static String memorysizeConversion(String memorySize) {
    String[] split = memorySize.split(" ");
    return CONVERT.get(split[1]).apply(Double.parseDouble(split[0])).replaceAll("(\\.\\d*?)0+(?!\\d)", "$1");
  }
}