import static java.util.Arrays.asList;

class NeedleInHaystack {
  static boolean find(String needle, String[] haystack) {
    return asList(haystack).contains(needle);
  }
}