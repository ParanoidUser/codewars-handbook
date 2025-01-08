import static java.util.stream.IntStream.range;

interface Modulus11 {
  static String addCheckDigit(String s) {
    int rem = range(0, s.length()).reduce(0, (r, i) -> r + (s.charAt(s.length() - i - 1) - '0') * (i % 6 + 2)) % 11;
    return s + (rem == 1 ? "X" : (11 - rem) % 11);
  }
}