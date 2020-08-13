import static java.util.stream.IntStream.range;

interface EANValidator {
  static boolean validate(String eanCode) {
    int sum = range(0, 12).map(i -> (eanCode.charAt(i) - 48) * (i % 2 > 0 ? 3 : 1)).sum();
    return eanCode.charAt(12) - 48 == (sum % 10 > 0 ? 10 - sum % 10 : 0);
  }
}
