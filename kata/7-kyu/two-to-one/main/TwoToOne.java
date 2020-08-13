import static java.util.stream.Collectors.joining;

interface TwoToOne {
  static String longest(String s1, String s2) {
    return (s1 + s2).chars().distinct().mapToObj(c -> String.valueOf((char) c)).sorted().collect(joining());
  }
}
