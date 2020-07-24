import static java.util.Set.of;

interface BlackOrWhiteKey {
  static String blackOrWhiteKey(int keyPressCount) {
    return of(1, 4, 6, 9, 11).contains(--keyPressCount % 88 % 12) ? "black" : "white";
  }
}
