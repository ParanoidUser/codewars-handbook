import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;

interface Kata {
  static String encryptThis(String text) {
    return compile(" ").splitAsStream(text)
                       .map(w -> w.isEmpty() ? w : (int) w.charAt(0) + (w.length() > 2 ? w.replaceFirst(".(.)(.*)(.)", "$3$2$1") : w.substring(1)))
                       .collect(joining(" "));
  }
}
