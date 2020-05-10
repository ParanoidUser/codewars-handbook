import static java.util.Map.of;

interface HowDoICompare {
  static String whatIs(Integer x) {
    return of(42, "everything", 1764, "everything squared").getOrDefault(x, "nothing");
  }
}
