import java.util.Map;

class HowDoICompare {
  static String whatIs(Integer x) {
    return Map.of(42, "everything", 1764, "everything squared").getOrDefault(x, "nothing");
  }
}
