import static java.util.Arrays.stream;

class SortAndStar {
  static String twoSort(String[] s) {
    return String.join("***", stream(s).sorted().findFirst().orElse("").split(""));
  }
}
