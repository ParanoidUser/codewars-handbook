import static java.util.Arrays.asList;

interface Kata {
  static String findNeedle(Object[] haystack) {
    return "found the needle at position " + asList(haystack).indexOf("needle");
  }
}
