import static java.util.Arrays.stream;

interface Kata {
  static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
    if (arrayOfArrays == null || arrayOfArrays.length == 0 || stream(arrayOfArrays).anyMatch(a -> a == null || a.length == 0)) {
      return 0;
    }
    return stream(arrayOfArrays).mapToInt(a -> a.length).sorted().reduce((a, b) -> a == b - 1 ? b : a).orElse(-1) + 1;
  }
}
