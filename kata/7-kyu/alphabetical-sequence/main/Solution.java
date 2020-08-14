import static java.util.stream.Collectors.joining;

interface Solution {
  static String alphaSeq(String s) {
    return s.toLowerCase().chars().sorted().mapToObj(c -> (char) (c - 32) + ("" + (char) c).repeat(c - 97)).collect(joining(","));
  }
}
