import java.util.List;

interface CaesarCipher {
  static List<String> movingShift(String plain, int shift) {
    var shifted = shift(List.of(plain), shift, 1);
    int l = shifted.length() / 5 + Math.min(shifted.length() % 5, 1);
    return List.of(shifted.split("(?<=\\G.{" + l + "})"));
  }

  static String demovingShift(List<String> parts, int shift) {
    return shift(parts, shift, 25);
  }

  private static String shift(List<String> parts, int shift, int n) {
    var result = new StringBuilder();
    for (char c : String.join("", parts).toCharArray()) {
      if (Character.isLetter(c)) {
        c = (char) (c < 'a' ? (c - 'A' + n * shift) % 26 + 'A' : (c - 'a' + n * shift) % 26 + 'a');
      }
      result.append(c);
      shift++;
    }
    return result.toString();
  }
}